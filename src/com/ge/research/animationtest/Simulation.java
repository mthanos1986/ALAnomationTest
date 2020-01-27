package com.ge.research.animationtest;

import java.util.Map;
import java.awt.Font;
import com.anylogic.engine.elements.*;



import static com.anylogic.engine.presentation.UtilitiesColor.*;

import com.anylogic.engine.*;

import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;



public class Simulation extends ExperimentSimulation<Main> {
  @AnyLogicInternalCodegenAPI
  public static String[] COMMAND_LINE_ARGUMENTS_xjal = new String[0];
  {
    setCommandLineArguments_xjal( COMMAND_LINE_ARGUMENTS_xjal );
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Simulation.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  // View areas
  @AnyLogicInternalCodegenAPI
  protected static final Font _button_Font = new Font("Dialog", 0, 11 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text_Font = new Font("Serif", 1, 28 );
  @AnyLogicInternalCodegenAPI
  protected static final Font _text1_Font = new Font("Serif", 2, 16 );
  @AnyLogicInternalCodegenAPI
  protected static final int _button = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _text = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int _text1 = 3;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 4;


  @Override
  @AnyLogicInternalCodegenAPI
  public void executeShapeControlAction( int _shape, int index ) {
    switch( _shape ) {
      case _button: {
          ShapeButton self = this.button;
if ( getState() == IDLE )
	run();
getExperimentHost().setPresentable( getEngine().getRoot() ); 
;}
        break;
      default:
        super.executeShapeControlAction( _shape, index );
        break;
    }
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private void _button_SetDynamicParams_xjal( ShapeButton shape ) {
    shape.setText(
getState() == IDLE ?
	"Run the model and switch to Main view" :
	"Switch to Main view" 
);
  }
  
  protected ShapeButton button;
  protected ShapeText text;
  protected ShapeText text1;
  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    button = new ShapeButton(
			Simulation.this, true, 40.0, 120.0, 
			330.0, 30.0,
            controlDefault, true,
            _button_Font, 
			"Run the model and switch to Main view" ) {
      @Override
      public void updateDynamicProperties() {
        _button_SetDynamicParams_xjal( this );
        super.updateDynamicProperties();
      }

      @Override
      @AnyLogicInternalCodegenAPI
      public void action() {
        executeShapeControlAction( _button, 0 );
      }      
      /**
       * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
       */ 
      @AnyLogicInternalCodegenAPI
      private static final long serialVersionUID = 579428675073782597L;
    };

    text = new ShapeText(
        SHAPE_DRAW_2D, true,40.0, 30.0, 0.0, 0.0, 
        black,"Model",
        _text_Font, ALIGNMENT_LEFT );

    text1 = new ShapeText(
        SHAPE_DRAW_2D, true,40.0, 63.0, 0.0, 0.0, 
        black,"Experiment setup page",
        _text1_Font, ALIGNMENT_LEFT );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

  @Override
  public int getWindowWidth() {
    return 800;
  }

  @Override
  public int getWindowHeight() {
    return 600;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onDestroy_xjal() {
    super.onDestroy_xjal();
  }

  
  @AnyLogicInternalCodegenAPI
  public static void main(String[] args) {
    
    COMMAND_LINE_ARGUMENTS_xjal = args;
    prepareBeforeExperimentStart_xjal( Simulation.class );
    Simulation ex = new Simulation();
    ex.setCommandLineArguments_xjal( args ); 

    IExperimentHost host = new ExperimentHost( ex );
    
    ex.setup( host );
    
    host.launch();
  }  
  /**
   * This number is here for model snapshot storing purpose. It shouldn't be modified by user.
   */ 
  @AnyLogicInternalCodegenAPI
  private static final long serialVersionUID = 579428674737514241L;

  @Override
  @AnyLogicInternalCodegenAPI
  public void initDefaultRandomNumberGenerator(Engine _e) {
    _e.setDefaultRandomGenerator( new java.util.Random() );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Main createRoot( Engine engine ) {
    // Create the root object
    return new Main( engine, null, null );
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupRootParameters( final Main self, boolean callOnChangeActions ) {
    final Main root = self; // for compatibility
  }
  

  /**
   * Engine setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupEngine(Engine engine) {
    engine.setATOL( 1.0E-5 );
    engine.setRTOL( 1.0E-5 );
    engine.setTTOL( 1.0E-5 );
    engine.setHTOL( 0.001 );
    engine.setSolverODE( Engine.SOLVER_ODE_EULER );
    engine.setSolverNAE( Engine.SOLVER_NAE_MODIFIED_NEWTON );
    engine.setSolverDAE( Engine.SOLVER_DAE_RK45_NEWTON );
    engine.setVMethods( 296241 );
    engine.setSimultaneousEventsSelectionMode( Engine.EVENT_SELECTION_LIFO );

    engine.setStartTime( 0.0 );
    engine.setTimeUnit( MINUTE );
    engine.setStartDate( toDate( 2020, JANUARY, 6, 19, 59, 12 ) );
    engine.setRealTimeMode( true );
    engine.setRealTimeScale( 1.0 );
  }

  /**
   * Experiment setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  // TODO AL-12850 merge this setup(..) generation code in all experiments - it has the same contents
  public void setup( IExperimentHost _e ) {
    setName( "Model : Simulation" );

    // Static initialization of persistent elements
    _createPersistentElementsBP0_xjal();

    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
    presentation = new ShapeTopLevelPresentationGroup( Simulation.this, true, 0, 0, 0, 0 , text, text1, button );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
    icon = new ShapeModelElementsGroup( Simulation.this, getElementProperty( "model.Simulation.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    _e.setZoomAndPanningEnabled( true );
    _e.setDeveloperPanelEnabled( true );
    _e.setDeveloperPanelVisibleOnStart( false );
  }

}

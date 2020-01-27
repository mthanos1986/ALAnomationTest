package com.ge.research.animationtest;


import com.anylogic.engine.*;
import com.anylogic.engine.gui.*;

import static com.anylogic.engine.Utilities.*;

public class RunConfiguration implements IRunConfiguration<Main> {
	/**
	 * Constructor
	 */
	public RunConfiguration() {
	}

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

		engine.setSimultaneousEventsSelectionMode(Engine.EVENT_SELECTION_LIFO);

		engine.setStartTime( 0.0 );
		engine.setTimeUnit( MINUTE );
		engine.setStartDate( toDate( 2020, JANUARY, 6, 19, 59, 12 ) );
		engine.setStopTime( 100.0 );
	}

	@Override
    public Main createRootAgent(Engine engine) {
    	return new Main( engine, null, null );
    }
	
	@Override
	@AnyLogicInternalCodegenAPI
	public void setupRootParameters( final Main root, boolean callOnChangeActions,
			IRunValueAccessor parameterSource ) {

	}
	
	@Override
	@AnyLogicInternalAPI
	public void getOutputValues(Main root, IRunOutputsConsumer outputsConsumer) {
	}

	@Override
	@AnyLogicInternalAPI
	public void setup( IExperimentHost host ) {
		host.setSpeed( 1.0 );
		host.setZoomAndPanningEnabled( true );
		host.setDeveloperPanelEnabled( false );
		host.setDeveloperPanelVisibleOnStart( false );
	}

}

package com.robot.adapter.guiceconfig;

import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.robot.adapter.exchange.RobotCommAdapterPanelFactory;
import com.robot.adapter.exchange.RobotPanelComponentsFactory;
import org.opentcs.customizations.controlcenter.ControlCenterInjectionModule;

/**
 * A custom Guice module for project-specific configuration.
 *
 * @author Martin Grzenia (Fraunhofer IML)
 */
public class RobotControlCenterInjectionModule
        extends ControlCenterInjectionModule {

    @Override
    protected void configure() {

        install(new FactoryModuleBuilder().build(RobotPanelComponentsFactory.class));
        commAdapterPanelFactoryBinder().addBinding().to(RobotCommAdapterPanelFactory.class);

    }
}

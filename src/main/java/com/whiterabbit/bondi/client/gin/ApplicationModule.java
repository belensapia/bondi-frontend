package com.whiterabbit.bondi.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.whiterabbit.bondi.client.application.ApplicationPresenter;
import com.whiterabbit.bondi.client.application.ApplicationView;
import com.whiterabbit.bondi.client.application.main.MainPresenter;
import com.whiterabbit.bondi.client.application.main.MainView;
import com.whiterabbit.bondi.client.application.map.MapPresenter;
import com.whiterabbit.bondi.client.application.map.MapView;

public class ApplicationModule extends AbstractPresenterModule {

	@Override
	protected void configure() {

		bindPresenter(ApplicationPresenter.class,
				ApplicationPresenter.MyView.class, ApplicationView.class,
				ApplicationPresenter.MyProxy.class);

		bindPresenter(MainPresenter.class, MainPresenter.MyView.class,
				MainView.class, MainPresenter.MyProxy.class);

		bindPresenter(MapPresenter.class, MapPresenter.MyView.class,
				MapView.class, MapPresenter.MyProxy.class);
	}

}

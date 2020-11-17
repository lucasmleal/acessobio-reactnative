package com.acessobioreactnative;

import com.acesso.acessobio_android.iAcessoBioCamera;
import com.acesso.acessobio_android.services.dto.ErrorBio;
import com.acesso.acessobio_android.services.dto.ResultCamera;
import com.facebook.react.ReactActivity;


public class MainActivity extends ReactActivity implements iAcessoBioCamera {

  public AcessoBioModule acessoBioModule;

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "AcessoBioReactNative";
  }

  @Override
  public void onSuccessCamera(ResultCamera result) {
    System.out.println(result);
    acessoBioModule.onSuccessCamera(result);
  }

  @Override
  public void onErrorCamera(ErrorBio errorBio) {

  }
}

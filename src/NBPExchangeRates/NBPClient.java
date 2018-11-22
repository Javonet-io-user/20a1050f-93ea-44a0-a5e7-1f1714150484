package NBPExchangeRates;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.*;
import NBPExchangeRates.*;
import jio.System.*;

public class NBPClient {
  protected NObject javonetHandle;

  public NBPClient() {
    try {
      javonetHandle = Javonet.New("NBPClient");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NBPClient(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public static java.lang.String GetExactTableLink(DateTime date) {
    try {
      return (java.lang.String) Javonet.getType("NBPClient").invoke("GetExactTableLink", date);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static java.lang.String GetLatestTableLink(DateTime date) {
    try {
      return (java.lang.String) Javonet.getType("NBPClient").invoke("GetLatestTableLink", date);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public static NBPExchangeRate GetLatestExchangeRate(
      DateTime date, java.lang.String currencySymbol) {
    try {
      return new NBPExchangeRate(
          (NObject)
              Javonet.getType("NBPClient").invoke("GetLatestExchangeRate", date, currencySymbol));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

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

public class NBPExchangeRate {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getTableNumber() {
    try {
      return (java.lang.String) javonetHandle.get("TableNumber");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.math.BigDecimal getConversionRate() {
    try {
      return (java.math.BigDecimal) javonetHandle.get("ConversionRate");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.math.BigDecimal getExchangeRate() {
    try {
      return (java.math.BigDecimal) javonetHandle.get("ExchangeRate");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getCurrency() {
    try {
      return (java.lang.String) javonetHandle.get("Currency");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public NBPExchangeRate(
      java.lang.String tableNumber,
      java.math.BigDecimal conversionRate,
      java.math.BigDecimal exchangeRate,
      java.lang.String currency) {
    try {
      javonetHandle =
          Javonet.New("NBPExchangeRate", tableNumber, conversionRate, exchangeRate, currency);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NBPExchangeRate(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}

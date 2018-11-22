package jio.System;

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
import jio.System.*;

public abstract class Enum extends ValueType implements IComparable, IFormattable, IConvertible {
  protected NObject javonetHandle;

  public Enum(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Boolean IConvertible_ToBoolean(IFormatProvider provider) {
    try {
      return javonetHandle.invoke("IConvertible_ToBoolean", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Character IConvertible_ToChar(IFormatProvider provider) {
    try {
      return javonetHandle.invoke("IConvertible_ToChar", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Byte IConvertible_ToSByte(IFormatProvider provider) {
    try {
      return javonetHandle.invoke("IConvertible_ToSByte", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Byte IConvertible_ToByte(IFormatProvider provider) {
    try {
      return javonetHandle.invoke("IConvertible_ToByte", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Short IConvertible_ToInt16(IFormatProvider provider) {
    try {
      return javonetHandle.invoke("IConvertible_ToInt16", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer IConvertible_ToUInt16(IFormatProvider provider) {
    try {
      return javonetHandle.invoke("IConvertible_ToUInt16", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer IConvertible_ToInt32(IFormatProvider provider) {
    try {
      return javonetHandle.invoke("IConvertible_ToInt32", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Long IConvertible_ToUInt32(IFormatProvider provider) {
    try {
      return javonetHandle.invoke("IConvertible_ToUInt32", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Long IConvertible_ToInt64(IFormatProvider provider) {
    try {
      return javonetHandle.invoke("IConvertible_ToInt64", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.math.BigInteger IConvertible_ToUInt64(IFormatProvider provider) {
    try {
      return javonetHandle.invoke("IConvertible_ToUInt64", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Float IConvertible_ToSingle(IFormatProvider provider) {
    try {
      return javonetHandle.invoke("IConvertible_ToSingle", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Double IConvertible_ToDouble(IFormatProvider provider) {
    try {
      return javonetHandle.invoke("IConvertible_ToDouble", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  public java.math.BigDecimal IConvertible_ToDecimal(IFormatProvider provider) {
    try {
      return (java.math.BigDecimal) javonetHandle.invoke("IConvertible_ToDecimal", provider);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public DateTime IConvertible_ToDateTime(IFormatProvider provider) {
    try {
      return new DateTime((NObject) javonetHandle.invoke("IConvertible_ToDateTime", provider));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object IConvertible_ToType(jio.System.Type type, IFormatProvider provider) {
    try {
      return (Object) javonetHandle.invoke("IConvertible_ToType", type, provider);
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

package jio.System.Reflection;

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
import jio.System.Reflection.*;
import jio.System.Runtime.InteropServices.*;
import jio.System.*;

public abstract class MemberInfo implements ICustomAttributeProvider, _MemberInfo {
  protected NObject javonetHandle;

  public MemberInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void GetTypeInfoCount(AtomicReference<java.lang.Long> pcTInfo) {
    try {
      javonetHandle.invoke(
          "GetTypeInfoCount", new NOut(pcTInfo, Helper.JavaToDotnetType.get(java.lang.Long.class)));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GetTypeInfo(java.lang.Long iTInfo, java.lang.Long lcid, java.lang.Integer ppTInfo) {
    try {
      javonetHandle.invoke("GetTypeInfo", iTInfo, lcid, ppTInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GetIDsOfNames(
      Guid riid,
      java.lang.Integer rgszNames,
      java.lang.Long cNames,
      java.lang.Long lcid,
      java.lang.Integer rgDispId) {
    try {
      javonetHandle.invoke("GetIDsOfNames", riid, rgszNames, cNames, lcid, rgDispId);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Invoke(
      java.lang.Long dispIdMember,
      Guid riid,
      java.lang.Long lcid,
      java.lang.Short wFlags,
      java.lang.Integer pDispParams,
      java.lang.Integer pVarResult,
      java.lang.Integer pExcepInfo,
      java.lang.Integer puArgErr) {
    try {
      javonetHandle.invoke(
          "Invoke",
          dispIdMember,
          riid,
          lcid,
          wFlags,
          pDispParams,
          pVarResult,
          pExcepInfo,
          puArgErr);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public jio.System.Type GetType() {
    try {
      return ConvertToConcreteInterfaceImplementation((NObject) javonetHandle.invoke("GetType"));
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

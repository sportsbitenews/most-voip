/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pj_constants_ {
  public final static pj_constants_ PJ_SUCCESS = new pj_constants_("PJ_SUCCESS", pjsua2JNI.PJ_SUCCESS_get());
  public final static pj_constants_ PJ_TRUE = new pj_constants_("PJ_TRUE", pjsua2JNI.PJ_TRUE_get());
  public final static pj_constants_ PJ_FALSE = new pj_constants_("PJ_FALSE", pjsua2JNI.PJ_FALSE_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pj_constants_ swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pj_constants_.class + " with value " + swigValue);
  }

  private pj_constants_(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pj_constants_(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pj_constants_(String swigName, pj_constants_ swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pj_constants_[] swigValues = { PJ_SUCCESS, PJ_TRUE, PJ_FALSE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RavePerigeeCovariance5D extends RavePerigeeCovariance3D {
  private long swigCPtr;

  protected RavePerigeeCovariance5D(long cPtr, boolean cMemoryOwn) {
    super(raveJNI.RavePerigeeCovariance5D_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RavePerigeeCovariance5D obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RavePerigeeCovariance5D(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RavePerigeeCovariance5D(float drr, float drt, float drp, float dre, float drz, float dtt, float dtp, float dte, float dtz, float dpp, float dpe, float dpz, float dee, float dez, float dzz) {
    this(raveJNI.new_RavePerigeeCovariance5D__SWIG_0(drr, drt, drp, dre, drz, dtt, dtp, dte, dtz, dpp, dpe, dpz, dee, dez, dzz), true);
  }

  public RavePerigeeCovariance5D(RavePerigeeCovariance3D arg0, float dre, float drz, float dte, float dtz, float dpe, float dpz, float dee, float dez, float dzz) {
    this(raveJNI.new_RavePerigeeCovariance5D__SWIG_1(RavePerigeeCovariance3D.getCPtr(arg0), arg0, dre, drz, dte, dtz, dpe, dpz, dee, dez, dzz), true);
  }

  public RavePerigeeCovariance5D() {
    this(raveJNI.new_RavePerigeeCovariance5D__SWIG_2(), true);
  }

  public float dre() {
    return raveJNI.RavePerigeeCovariance5D_dre(swigCPtr, this);
  }

  public float drz() {
    return raveJNI.RavePerigeeCovariance5D_drz(swigCPtr, this);
  }

  public float dte() {
    return raveJNI.RavePerigeeCovariance5D_dte(swigCPtr, this);
  }

  public float dtz() {
    return raveJNI.RavePerigeeCovariance5D_dtz(swigCPtr, this);
  }

  public float dpe() {
    return raveJNI.RavePerigeeCovariance5D_dpe(swigCPtr, this);
  }

  public float dpz() {
    return raveJNI.RavePerigeeCovariance5D_dpz(swigCPtr, this);
  }

  public float dee() {
    return raveJNI.RavePerigeeCovariance5D_dee(swigCPtr, this);
  }

  public float dez() {
    return raveJNI.RavePerigeeCovariance5D_dez(swigCPtr, this);
  }

  public float dzz() {
    return raveJNI.RavePerigeeCovariance5D_dzz(swigCPtr, this);
  }

}

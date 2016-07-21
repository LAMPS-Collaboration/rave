/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RaveCovariance6D {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RaveCovariance6D(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RaveCovariance6D obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RaveCovariance6D(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RaveCovariance6D(float dxx, float dxy, float dxz, float dyy, float dyz, float dzz, float dxpx, float dxpy, float dxpz, float dypx, float dypy, float dypz, float dzpx, float dzpy, float dzpz, float dpxpx, float dpxpy, float dpxpz, float dpypy, float dpypz, float dpzpz) {
    this(raveJNI.new_RaveCovariance6D__SWIG_0(dxx, dxy, dxz, dyy, dyz, dzz, dxpx, dxpy, dxpz, dypx, dypy, dypz, dzpx, dzpy, dzpz, dpxpx, dpxpy, dpxpz, dpypy, dpypz, dpzpz), true);
  }

  public RaveCovariance6D() {
    this(raveJNI.new_RaveCovariance6D__SWIG_1(), true);
  }

  public float dxx() {
    return raveJNI.RaveCovariance6D_dxx(swigCPtr, this);
  }

  public float dxy() {
    return raveJNI.RaveCovariance6D_dxy(swigCPtr, this);
  }

  public float dxz() {
    return raveJNI.RaveCovariance6D_dxz(swigCPtr, this);
  }

  public float dyy() {
    return raveJNI.RaveCovariance6D_dyy(swigCPtr, this);
  }

  public float dyz() {
    return raveJNI.RaveCovariance6D_dyz(swigCPtr, this);
  }

  public float dzz() {
    return raveJNI.RaveCovariance6D_dzz(swigCPtr, this);
  }

  public float dxpx() {
    return raveJNI.RaveCovariance6D_dxpx(swigCPtr, this);
  }

  public float dxpy() {
    return raveJNI.RaveCovariance6D_dxpy(swigCPtr, this);
  }

  public float dxpz() {
    return raveJNI.RaveCovariance6D_dxpz(swigCPtr, this);
  }

  public float dypx() {
    return raveJNI.RaveCovariance6D_dypx(swigCPtr, this);
  }

  public float dypy() {
    return raveJNI.RaveCovariance6D_dypy(swigCPtr, this);
  }

  public float dypz() {
    return raveJNI.RaveCovariance6D_dypz(swigCPtr, this);
  }

  public float dzpx() {
    return raveJNI.RaveCovariance6D_dzpx(swigCPtr, this);
  }

  public float dzpy() {
    return raveJNI.RaveCovariance6D_dzpy(swigCPtr, this);
  }

  public float dzpz() {
    return raveJNI.RaveCovariance6D_dzpz(swigCPtr, this);
  }

  public float dpxpx() {
    return raveJNI.RaveCovariance6D_dpxpx(swigCPtr, this);
  }

  public float dpxpy() {
    return raveJNI.RaveCovariance6D_dpxpy(swigCPtr, this);
  }

  public float dpxpz() {
    return raveJNI.RaveCovariance6D_dpxpz(swigCPtr, this);
  }

  public float dpypy() {
    return raveJNI.RaveCovariance6D_dpypy(swigCPtr, this);
  }

  public float dpypz() {
    return raveJNI.RaveCovariance6D_dpypz(swigCPtr, this);
  }

  public float dpzpz() {
    return raveJNI.RaveCovariance6D_dpzpz(swigCPtr, this);
  }

  public boolean equal(RaveCovariance6D other) {
    return raveJNI.RaveCovariance6D_equal(swigCPtr, this, RaveCovariance6D.getCPtr(other), other);
  }

  public String toString() {
    return raveJNI.RaveCovariance6D_toString(swigCPtr, this);
  }

  public String __str__() {
    return raveJNI.RaveCovariance6D___str__(swigCPtr, this);
  }

}

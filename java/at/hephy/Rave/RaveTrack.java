/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RaveTrack {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RaveTrack(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RaveTrack obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RaveTrack(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RaveTrack(RaveVector6D arg0, RaveCovariance6D arg1, int arg2, float chi2, float ndof, SWIGTYPE_p_void originaltrack, String tag) {
    this(raveJNI.new_RaveTrack__SWIG_0(RaveVector6D.getCPtr(arg0), arg0, RaveCovariance6D.getCPtr(arg1), arg1, arg2, chi2, ndof, SWIGTYPE_p_void.getCPtr(originaltrack), tag), true);
  }

  public RaveTrack(RaveVector6D arg0, RaveCovariance6D arg1, int arg2, float chi2, float ndof, SWIGTYPE_p_void originaltrack) {
    this(raveJNI.new_RaveTrack__SWIG_1(RaveVector6D.getCPtr(arg0), arg0, RaveCovariance6D.getCPtr(arg1), arg1, arg2, chi2, ndof, SWIGTYPE_p_void.getCPtr(originaltrack)), true);
  }

  public RaveTrack(RaveVector6D arg0, RaveCovariance6D arg1, int arg2, float chi2, float ndof) {
    this(raveJNI.new_RaveTrack__SWIG_2(RaveVector6D.getCPtr(arg0), arg0, RaveCovariance6D.getCPtr(arg1), arg1, arg2, chi2, ndof), true);
  }

  public RaveTrack(int id, RaveVector6D arg1, RaveCovariance6D arg2, int arg3, float chi2, float ndof, SWIGTYPE_p_void originaltrack, String tag) {
    this(raveJNI.new_RaveTrack__SWIG_3(id, RaveVector6D.getCPtr(arg1), arg1, RaveCovariance6D.getCPtr(arg2), arg2, arg3, chi2, ndof, SWIGTYPE_p_void.getCPtr(originaltrack), tag), true);
  }

  public RaveTrack(int id, RaveVector6D arg1, RaveCovariance6D arg2, int arg3, float chi2, float ndof, SWIGTYPE_p_void originaltrack) {
    this(raveJNI.new_RaveTrack__SWIG_4(id, RaveVector6D.getCPtr(arg1), arg1, RaveCovariance6D.getCPtr(arg2), arg2, arg3, chi2, ndof, SWIGTYPE_p_void.getCPtr(originaltrack)), true);
  }

  public RaveTrack(int id, RaveVector6D arg1, RaveCovariance6D arg2, int arg3, float chi2, float ndof) {
    this(raveJNI.new_RaveTrack__SWIG_5(id, RaveVector6D.getCPtr(arg1), arg1, RaveCovariance6D.getCPtr(arg2), arg2, arg3, chi2, ndof), true);
  }

  public RaveTrack(RaveVector6D arg0, RaveCovariance6D arg1, int arg2, float chi2, float ndof, int originaltrack, String tag) {
    this(raveJNI.new_RaveTrack__SWIG_6(RaveVector6D.getCPtr(arg0), arg0, RaveCovariance6D.getCPtr(arg1), arg1, arg2, chi2, ndof, originaltrack, tag), true);
  }

  public RaveTrack(RaveVector6D arg0, RaveCovariance6D arg1, int arg2, float chi2, float ndof, int originaltrack) {
    this(raveJNI.new_RaveTrack__SWIG_7(RaveVector6D.getCPtr(arg0), arg0, RaveCovariance6D.getCPtr(arg1), arg1, arg2, chi2, ndof, originaltrack), true);
  }

  public RaveTrack(WeightedRaveTrackContainer components) {
    this(raveJNI.new_RaveTrack__SWIG_8(WeightedRaveTrackContainer.getCPtr(components), components), true);
  }

  public RaveTrack(int id, WeightedRaveTrackContainer components) {
    this(raveJNI.new_RaveTrack__SWIG_9(id, WeightedRaveTrackContainer.getCPtr(components), components), true);
  }

  public RaveTrack(SWIGTYPE_p_rave__BasicTrack arg0) {
    this(raveJNI.new_RaveTrack__SWIG_10(SWIGTYPE_p_rave__BasicTrack.getCPtr(arg0)), true);
  }

  public RaveTrack() {
    this(raveJNI.new_RaveTrack__SWIG_11(), true);
  }

  public int charge() {
    return raveJNI.RaveTrack_charge(swigCPtr, this);
  }

  public RaveVector6D state() {
    return new RaveVector6D(raveJNI.RaveTrack_state(swigCPtr, this), false);
  }

  public RavePoint3D momentum() {
    return new RavePoint3D(raveJNI.RaveTrack_momentum(swigCPtr, this), false);
  }

  public RavePoint3D position() {
    return new RavePoint3D(raveJNI.RaveTrack_position(swigCPtr, this), false);
  }

  public float pt() {
    return raveJNI.RaveTrack_pt(swigCPtr, this);
  }

  public RaveCovariance6D error() {
    return new RaveCovariance6D(raveJNI.RaveTrack_error(swigCPtr, this), false);
  }

  public SWIGTYPE_p_void originalObject() {
    long cPtr = raveJNI.RaveTrack_originalObject(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public String tag() {
    return raveJNI.RaveTrack_tag(swigCPtr, this);
  }

  public int id() {
    return raveJNI.RaveTrack_id(swigCPtr, this);
  }

  public float chi2() {
    return raveJNI.RaveTrack_chi2(swigCPtr, this);
  }

  public float ndof() {
    return raveJNI.RaveTrack_ndof(swigCPtr, this);
  }

  public RavePerigeeParameters5D perigeeParameters() {
    return new RavePerigeeParameters5D(raveJNI.RaveTrack_perigeeParameters(swigCPtr, this), false);
  }

  public RavePerigeeCovariance5D perigeeCovariance() {
    return new RavePerigeeCovariance5D(raveJNI.RaveTrack_perigeeCovariance(swigCPtr, this), false);
  }

  public boolean isValid() {
    return raveJNI.RaveTrack_isValid(swigCPtr, this);
  }

  public WeightedRaveTrackContainer components() {
    return new WeightedRaveTrackContainer(raveJNI.RaveTrack_components(swigCPtr, this), true);
  }

  public boolean RaveEquals(RaveTrack arg0) {
    return raveJNI.RaveTrack_RaveEquals(swigCPtr, this, RaveTrack.getCPtr(arg0), arg0);
  }

  public String toString() {
    return raveJNI.RaveTrack_toString(swigCPtr, this);
  }

  public String __str__() {
    return raveJNI.RaveTrack___str__(swigCPtr, this);
  }

}

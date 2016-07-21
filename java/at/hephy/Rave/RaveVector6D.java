/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RaveVector6D {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RaveVector6D(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RaveVector6D obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RaveVector6D(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RaveVector6D() {
    this(raveJNI.new_RaveVector6D__SWIG_0(), true);
  }

  public RaveVector6D(float x, float y, float z, float px, float py, float pz) {
    this(raveJNI.new_RaveVector6D__SWIG_1(x, y, z, px, py, pz), true);
  }

  public RaveVector6D(RavePoint3D position, RavePoint3D momentum) {
    this(raveJNI.new_RaveVector6D__SWIG_2(RavePoint3D.getCPtr(position), position, RavePoint3D.getCPtr(momentum), momentum), true);
  }

  public float x() {
    return raveJNI.RaveVector6D_x(swigCPtr, this);
  }

  public float y() {
    return raveJNI.RaveVector6D_y(swigCPtr, this);
  }

  public float z() {
    return raveJNI.RaveVector6D_z(swigCPtr, this);
  }

  public float px() {
    return raveJNI.RaveVector6D_px(swigCPtr, this);
  }

  public float py() {
    return raveJNI.RaveVector6D_py(swigCPtr, this);
  }

  public float pz() {
    return raveJNI.RaveVector6D_pz(swigCPtr, this);
  }

  public RavePoint3D momentum() {
    return new RavePoint3D(raveJNI.RaveVector6D_momentum(swigCPtr, this), true);
  }

  public RavePoint3D position() {
    return new RavePoint3D(raveJNI.RaveVector6D_position(swigCPtr, this), true);
  }

  public void addMomentum(RavePoint3D other) {
    raveJNI.RaveVector6D_addMomentum(swigCPtr, this, RavePoint3D.getCPtr(other), other);
  }

  public boolean equal(RaveVector6D other) {
    return raveJNI.RaveVector6D_equal(swigCPtr, this, RaveVector6D.getCPtr(other), other);
  }

  public String toString() {
    return raveJNI.RaveVector6D_toString(swigCPtr, this);
  }

  public String __str__() {
    return raveJNI.RaveVector6D___str__(swigCPtr, this);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RavePoint3D {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RavePoint3D(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RavePoint3D obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RavePoint3D(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RavePoint3D(float x, float y, float z) {
    this(raveJNI.new_RavePoint3D__SWIG_0(x, y, z), true);
  }

  public RavePoint3D() {
    this(raveJNI.new_RavePoint3D__SWIG_1(), true);
  }

  public float x() {
    return raveJNI.RavePoint3D_x(swigCPtr, this);
  }

  public float y() {
    return raveJNI.RavePoint3D_y(swigCPtr, this);
  }

  public float z() {
    return raveJNI.RavePoint3D_z(swigCPtr, this);
  }

  public float mag() {
    return raveJNI.RavePoint3D_mag(swigCPtr, this);
  }

  public float mag2() {
    return raveJNI.RavePoint3D_mag2(swigCPtr, this);
  }

  public float perp() {
    return raveJNI.RavePoint3D_perp(swigCPtr, this);
  }

  public float perp2() {
    return raveJNI.RavePoint3D_perp2(swigCPtr, this);
  }

  public boolean equal(RavePoint3D other) {
    return raveJNI.RavePoint3D_equal(swigCPtr, this, RavePoint3D.getCPtr(other), other);
  }

  public void add(RavePoint3D other) {
    raveJNI.RavePoint3D_add(swigCPtr, this, RavePoint3D.getCPtr(other), other);
  }

  public void subtract(RavePoint3D other) {
    raveJNI.RavePoint3D_subtract(swigCPtr, this, RavePoint3D.getCPtr(other), other);
  }

  public void multiply(double scale) {
    raveJNI.RavePoint3D_multiply(swigCPtr, this, scale);
  }

  public String toString() {
    return raveJNI.RavePoint3D_toString(swigCPtr, this);
  }

  public String __str__() {
    return raveJNI.RavePoint3D___str__(swigCPtr, this);
  }

}
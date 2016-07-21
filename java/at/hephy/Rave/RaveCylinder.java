/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RaveCylinder {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RaveCylinder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RaveCylinder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RaveCylinder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RaveCylinder(RavePoint3D pos, RavePoint3D axis, float radius) {
    this(raveJNI.new_RaveCylinder(RavePoint3D.getCPtr(pos), pos, RavePoint3D.getCPtr(axis), axis, radius), true);
  }

  public RavePoint3D position() {
    return new RavePoint3D(raveJNI.RaveCylinder_position(swigCPtr, this), true);
  }

  public RavePoint3D axis() {
    return new RavePoint3D(raveJNI.RaveCylinder_axis(swigCPtr, this), true);
  }

  public float radius() {
    return raveJNI.RaveCylinder_radius(swigCPtr, this);
  }

}

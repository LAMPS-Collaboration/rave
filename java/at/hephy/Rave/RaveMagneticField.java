/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RaveMagneticField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RaveMagneticField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RaveMagneticField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RaveMagneticField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RavePoint3D inTesla(RavePoint3D arg0) {
    return new RavePoint3D(raveJNI.RaveMagneticField_inTesla(swigCPtr, this, RavePoint3D.getCPtr(arg0), arg0), true);
  }

  public RaveMagneticField copy() {
    long cPtr = raveJNI.RaveMagneticField_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new RaveMagneticField(cPtr, false);
  }

}

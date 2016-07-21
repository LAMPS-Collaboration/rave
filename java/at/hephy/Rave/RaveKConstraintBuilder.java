/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package at.hephy.Rave;

public class RaveKConstraintBuilder {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RaveKConstraintBuilder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RaveKConstraintBuilder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        raveJNI.delete_RaveKConstraintBuilder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RaveKConstraintBuilder() {
    this(raveJNI.new_RaveKConstraintBuilder(), true);
  }

  public RaveKConstraint createBackToBackKinematicConstraint() {
    return new RaveKConstraint(raveJNI.RaveKConstraintBuilder_createBackToBackKinematicConstraint(swigCPtr, this), true);
  }

  public RaveKConstraint createEqualMassKinematicConstraint() {
    return new RaveKConstraint(raveJNI.RaveKConstraintBuilder_createEqualMassKinematicConstraint(swigCPtr, this), true);
  }

  public RaveKConstraint createFourMomentumKinematicConstraint(RaveVector4D momentum, RaveVector4D deviation, boolean mass_is_energy) {
    return new RaveKConstraint(raveJNI.RaveKConstraintBuilder_createFourMomentumKinematicConstraint__SWIG_0(swigCPtr, this, RaveVector4D.getCPtr(momentum), momentum, RaveVector4D.getCPtr(deviation), deviation, mass_is_energy), true);
  }

  public RaveKConstraint createFourMomentumKinematicConstraint(RaveVector4D momentum, RaveVector4D deviation) {
    return new RaveKConstraint(raveJNI.RaveKConstraintBuilder_createFourMomentumKinematicConstraint__SWIG_1(swigCPtr, this, RaveVector4D.getCPtr(momentum), momentum, RaveVector4D.getCPtr(deviation), deviation), true);
  }

  public RaveKConstraint createMomentumKinematicConstraint(RavePoint3D momentum, RavePoint3D deviation) {
    return new RaveKConstraint(raveJNI.RaveKConstraintBuilder_createMomentumKinematicConstraint(swigCPtr, this, RavePoint3D.getCPtr(momentum), momentum, RavePoint3D.getCPtr(deviation), deviation), true);
  }

  public RaveKConstraint createPointingKinematicConstraint(RavePoint3D reference) {
    return new RaveKConstraint(raveJNI.RaveKConstraintBuilder_createPointingKinematicConstraint(swigCPtr, this, RavePoint3D.getCPtr(reference), reference), true);
  }

  public RaveKConstraint createSimplePointingConstraint(RavePoint3D reference) {
    return new RaveKConstraint(raveJNI.RaveKConstraintBuilder_createSimplePointingConstraint(swigCPtr, this, RavePoint3D.getCPtr(reference), reference), true);
  }

  public RaveKConstraint createSmartPointingConstraint(RavePoint3D reference) {
    return new RaveKConstraint(raveJNI.RaveKConstraintBuilder_createSmartPointingConstraint(swigCPtr, this, RavePoint3D.getCPtr(reference), reference), true);
  }

  public RaveKConstraint createMassKinematicConstraint(float mass, float sigma) {
    return new RaveKConstraint(raveJNI.RaveKConstraintBuilder_createMassKinematicConstraint(swigCPtr, this, mass, sigma), true);
  }

  public RaveKMultipleConstraint createMultipleKinematicConstraint() {
    return new RaveKMultipleConstraint(raveJNI.RaveKConstraintBuilder_createMultipleKinematicConstraint(swigCPtr, this), true);
  }

  public RaveKConstraint createVertexKinematicConstraint() {
    return new RaveKConstraint(raveJNI.RaveKConstraintBuilder_createVertexKinematicConstraint(swigCPtr, this), true);
  }

  public RaveKConstraint createTwoTrackMassKinematicConstraint(float mass) {
    return new RaveKConstraint(raveJNI.RaveKConstraintBuilder_createTwoTrackMassKinematicConstraint(swigCPtr, this, mass), true);
  }

  public RaveKConstraint createMultiTrackMassKinematicConstraint(float mass, int nparticles) {
    return new RaveKConstraint(raveJNI.RaveKConstraintBuilder_createMultiTrackMassKinematicConstraint(swigCPtr, this, mass, nparticles), true);
  }

}
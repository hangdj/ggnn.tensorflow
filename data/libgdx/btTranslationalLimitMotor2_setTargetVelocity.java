public void setTargetVelocity(btVector3 value) {
    DynamicsJNI.btTranslationalLimitMotor2_targetVelocity_set(swigCPtr, this, btVector3.getCPtr(value), value);
}

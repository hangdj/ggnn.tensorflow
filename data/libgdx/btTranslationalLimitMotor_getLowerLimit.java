public btVector3 getLowerLimit() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor_lowerLimit_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
}

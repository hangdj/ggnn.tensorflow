public btVector3 getCurrentLimitError() {
    long cPtr = DynamicsJNI.btTranslationalLimitMotor_currentLimitError_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
}

public btVector3FloatData getLinearUpperLimit() {
    long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintData_linearUpperLimit_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
}

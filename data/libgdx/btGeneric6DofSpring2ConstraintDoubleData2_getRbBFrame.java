public btTransformDoubleData getRbBFrame() {
    long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_rbBFrame_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
}

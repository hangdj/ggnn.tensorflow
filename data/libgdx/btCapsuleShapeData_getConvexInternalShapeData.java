public btConvexInternalShapeData getConvexInternalShapeData() {
    long cPtr = CollisionJNI.btCapsuleShapeData_convexInternalShapeData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btConvexInternalShapeData(cPtr, false);
}

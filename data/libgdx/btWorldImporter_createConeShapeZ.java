public btCollisionShape createConeShapeZ(float radius, float height) {
    long cPtr = ExtrasJNI.btWorldImporter_createConeShapeZ(swigCPtr, this, radius, height);
    return (cPtr == 0) ? null : btCollisionShape.newDerivedObject(cPtr, false);
}

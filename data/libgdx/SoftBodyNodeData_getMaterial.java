public SoftBodyMaterialData getMaterial() {
    long cPtr = SoftbodyJNI.SoftBodyNodeData_material_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyMaterialData(cPtr, false);
}

public btVector3 getWheelAxleWS() {
    long cPtr = DynamicsJNI.btWheelInfo_RaycastInfo_wheelAxleWS_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
}

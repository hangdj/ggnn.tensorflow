public void rayTest(Vector3 rayFrom, Vector3 rayTo, btBroadphaseRayCallback rayCallback) {
    CollisionJNI.btSimpleBroadphase_rayTest__SWIG_2(swigCPtr, this, rayFrom, rayTo, btBroadphaseRayCallback.getCPtr(rayCallback), rayCallback);
}

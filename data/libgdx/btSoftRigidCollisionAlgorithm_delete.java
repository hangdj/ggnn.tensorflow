@Override
protected synchronized void delete() {
    if (swigCPtr != 0) {
        if (swigCMemOwn) {
            swigCMemOwn = false;
            SoftbodyJNI.delete_btSoftRigidCollisionAlgorithm_CreateFunc(swigCPtr);
        }
        swigCPtr = 0;
    }
    super.delete();
}

@Override
protected synchronized void delete() {
    if (swigCPtr != 0) {
        if (swigCMemOwn) {
            swigCMemOwn = false;
            DynamicsJNI.delete_btUniversalConstraint(swigCPtr);
        }
        swigCPtr = 0;
    }
    super.delete();
}

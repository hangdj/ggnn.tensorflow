public btVector3 getContactPoint() {
    long cPtr = LinearMathJNI.btIDebugDraw_DefaultColors_contactPoint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
}

@Override
protected void reset(long cPtr, boolean cMemoryOwn) {
    if (!destroyed)
        destroy();
    super.reset(CollisionJNI.btGImpactMeshShapePart_TrimeshPrimitiveManager_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
}

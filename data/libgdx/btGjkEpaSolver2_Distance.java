public static boolean Distance(btConvexShape shape0, Matrix4 wtrs0, btConvexShape shape1, Matrix4 wtrs1, Vector3 guess, btGjkEpaSolver2.sResults results) {
    return CollisionJNI.btGjkEpaSolver2_Distance(btConvexShape.getCPtr(shape0), shape0, wtrs0, btConvexShape.getCPtr(shape1), shape1, wtrs1, guess, btGjkEpaSolver2.sResults.getCPtr(results), results);
}

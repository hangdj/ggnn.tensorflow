/*
		b2DistanceJoint* joint = (b2DistanceJoint*)addr;
		anchor[0] = joint->GetLocalAnchorA().x;
		anchor[1] = joint->GetLocalAnchorA().y;
	*/
public Vector2 getLocalAnchorB() {
    jniGetLocalAnchorB(addr, tmp);
    localAnchorB.set(tmp[0], tmp[1]);
    return localAnchorB;
}

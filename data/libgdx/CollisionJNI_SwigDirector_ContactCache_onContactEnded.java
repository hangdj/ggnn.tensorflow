public static void SwigDirector_ContactCache_onContactEnded(ContactCache jself, long colObj0, boolean match0, long colObj1, boolean match1) {
    jself.onContactEnded(btCollisionObject.getInstance(colObj0, false), match0, btCollisionObject.getInstance(colObj1, false), match1);
}

public synchronized boolean touchDown(int screenX, int screenY, int pointer, int button) {
    queueTime();
    queue.add(TOUCH_DOWN);
    queue.add(screenX);
    queue.add(screenY);
    queue.add(pointer);
    queue.add(button);
    return false;
}

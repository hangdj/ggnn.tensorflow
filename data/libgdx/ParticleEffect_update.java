public void update(float delta) {
    for (int i = 0, n = emitters.size; i < n; i++) emitters.get(i).update(delta);
}

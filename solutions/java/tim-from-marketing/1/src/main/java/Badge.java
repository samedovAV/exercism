class Badge {
    public String print(Integer id, String name, String department) {
        String dep = (department == null) ? "OWNER" : department.toUpperCase();

        if (id == null) {
            return String.format("%s - %s", name, dep);
        }
        return String.format("[%d] - %s - %s", id, name, dep);
    }
}

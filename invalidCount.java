class invalidCount {
    public static void main(String[] args) {
        int vcount = 0;
        int ivcount = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                int a = Integer.parseInt(args[i]);
                if (a >= 0 || a <= 0) {
                    vcount++;
                }
            } catch (NumberFormatException e) {
                ivcount++;
            }
        }
        System.out.println("Valid Count :- " + vcount);
        System.out.println("Invalid Count :- " + ivcount);
    }
}

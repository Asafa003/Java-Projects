public class Java8Features {
    public static void main(String[] args) throws Exception {
        // 1) Lambda for Runnable
        Runnable r = () -> System.out.println("Lambda Runnable running");
        r.run();

        // 2) Functional interface + method reference
        java.util.function.Function<String, Integer> parse = Integer::parseInt;
        System.out.println("Parsed: " + parse.apply("42"));

        // 3) Streams: filter, map, collect, reduce
        java.util.List<String> names = java.util.Arrays.asList("alice","bob","carol","dave");
        java.util.List<String> upperSorted = names.stream()
            .filter(s -> s.length() > 3)         // intermediate op
            .map(String::toUpperCase)            // method reference
            .sorted()                            // natural order
            .collect(java.util.stream.Collectors.toList()); // terminal op
        System.out.println("Stream result: " + upperSorted);

        // reduce example
        String joined = names.stream().reduce((a,b) -> a + "," + b).orElse("");
        System.out.println("Joined: " + joined);

        // 4) Optional: avoid null checks
        java.util.Optional<String> maybe = java.util.Optional.ofNullable(null);
        System.out.println("Optional orElse: " + maybe.orElse("default"));

        java.util.Optional<String> present = java.util.Optional.of("value");
        present.ifPresent(v -> System.out.println("Optional value: " + v));

        // 5) Default method in interface (sample)
        Printable p = () -> "hello";
        System.out.println("Printable: " + p.printUpper());

        // 6) java.time API (LocalDate, LocalDateTime, Duration, formatting)
        java.time.LocalDate today = java.time.LocalDate.now();
        java.time.LocalDate nextWeek = today.plusWeeks(1);
        java.time.LocalDateTime now = java.time.LocalDateTime.now();
        java.time.Duration d = java.time.Duration.ofHours(5).plusMinutes(30);
        java.time.format.DateTimeFormatter fmt = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println("Today: " + today + ", Next week: " + nextWeek);
        System.out.println("Now: " + now.format(fmt) + ", Duration: " + d);

        // 7) CompletableFuture (async)
        java.util.concurrent.CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(300); } catch (InterruptedException e) {}
            return "async result";
        }).thenApply(String::toUpperCase)
          .thenAccept(s -> System.out.println("CompletableFuture: " + s))
          .get(); // wait for completion in this demo
    }

    // functional interface example with default method
    @FunctionalInterface
    interface Printable {
        String print();
        default String printUpper() {
            return print().toUpperCase();
        }
    }
}
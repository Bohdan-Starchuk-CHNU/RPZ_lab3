# Key Optimizations

1. Used `Files.readString` to read the file directly into a string, reducing memory usage by avoiding intermediate steps.
2. Replaced `Consumer<T>` with `Runnable` in `MeasureTimeUtil` to avoid unnecessary boxing and unboxing of arguments.
3. Removed unnecessary filtering and trimming in `WordUtil.getWords` method to simplify processing and reduce memory overhead.
4. Replaced `LocalDateTime` with `System.currentTimeMillis()` for time measurement to reduce object creation.
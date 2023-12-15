public class GraphIntro{
    public static void main(){
        // Build the graph -- could use Map
        // {a: [b,c], b: [d]}
        Map<String, List<String>> graph = Map.of(
            "a", List.of("b", "c"),
            "b", List.of("d"),
            "c", List.of("e"),
            "d", List.of(),
            "e", List.of()
        );

        System.out.println(graph.get("a"))
    }

    public static void depthFirstPrint(Map<)


}
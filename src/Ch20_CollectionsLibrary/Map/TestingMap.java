package Ch20_CollectionsLibrary.Map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {

    static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Sujit", 26);
        map.put("Aman", 15);
        map.put("Sumit", 65);
        map.put("Rahul", 32);
        map.put("Vivek", 25);
        map.put("Mohan", 71);
        map.put("Nikhil", 14);

        System.out.printf("Map Size %d \n", map.size());
        System.out.println("Get Method : " + map.get("Aman"));
        System.out.println("Contain Method : " + map.containsKey("Sumit"));
        System.out.println("Contain Method : " + map.containsKey("Amit"));
        System.out.println("Remove Method : " + map.remove("Rahul"));
        System.out.printf("Map Size %d \n", map.size());


        for (String key : map.keySet()){
            System.out.printf("%s : %s \n", key, map.get(key));
        }

    }



/*
================================================================================
                         JAVA MAP - COMPLETE NOTES
                         Java 25 | java.util Package
================================================================================


================================================================================
1. MAP INTRODUCTION
================================================================================

// Map is an interface available in java.util package.

// Map stores data in Key-Value pairs.

// Example:
// Key          Value
// 101          Sujit
// 102          Amit
// 103          Rohit

// IMPORTANT FEATURES:

// 1. Every key must be unique.
// 2. Values can be duplicate.
// 3. One key can map to only one value at a time.
// 4. Adding an existing key replaces its previous value.
// 5. Map does not extend Collection interface.
// 6. Map does not provide index-based access.
// 7. Map provides three main views:
//    a. keySet()
//    b. values()
//    c. entrySet()
// 8. Ordering depends on Map implementation.
// 9. Null key and null value support depends on implementation.
// 10. Map uses equals() and hashCode() to identify keys in hash-based maps.

// GENERIC TYPES:

// Map<K, V>

// K = Key data type
// V = Value data type

// Example:
// Map<String, Integer>
// Key   = String
// Value = Integer


================================================================================
2. MAP INTERFACE HIERARCHY
================================================================================

// Map (Interface)
// |
// |-- SequencedMap (Interface)              [Java 21+]
// |     |
// |     |-- SortedMap (Interface)
// |     |     |
// |     |     |-- NavigableMap (Interface)
// |     |           |
// |     |           |-- TreeMap (Class)
// |
// |-- HashMap (Class)
// |     |
// |     |-- LinkedHashMap (Class)
// |
// |-- Hashtable (Class)
// |-- WeakHashMap (Class)
// |-- IdentityHashMap (Class)
// |-- EnumMap (Class)
// |-- ConcurrentHashMap (Class)
// |-- ConcurrentSkipListMap (Class)

// IMPORTANT:
// 1. SequencedMap extends Map.
// 2. SortedMap extends SequencedMap.
// 3. NavigableMap extends SortedMap.
// 4. HashMap, LinkedHashMap and TreeMap are separate implementations.
// 5. Map.Entry is a nested interface inside Map.
// 6. Map.Entry is NOT a child interface of Map.

// Note:
// ConcurrentHashMap implements ConcurrentMap.
// ConcurrentSkipListMap implements ConcurrentNavigableMap.


================================================================================
3. MAP IMPLEMENTATIONS
================================================================================


// 1. HashMap

// HashMap stores data in key-value pairs.
// Does not guarantee insertion order.
// Allows one null key.
// Allows multiple null values.
// Duplicate keys are not allowed.
// Average O(1) put(), get() and remove() operations.
// Uses hashCode() and equals() for key identification.

// Example:
// Map<String, Integer> map = new HashMap<>();


// 2. LinkedHashMap

// LinkedHashMap extends HashMap.
// Maintains insertion order by default.
// Allows one null key.
// Allows multiple null values.
// Can also maintain access order.
// Uses additional memory to maintain linked ordering.

// Example:
// Map<String, Integer> map = new LinkedHashMap<>();


// 3. TreeMap

// TreeMap implements NavigableMap.
// Stores keys in sorted order.
// Uses natural ordering or a custom Comparator.
// Does not allow null keys with natural ordering.
// Allows null values.
// Basic operations generally O(log n).
// Internally uses a Red-Black Tree.

// Example:
// Map<String, Integer> map = new TreeMap<>();


// 4. Hashtable

// Legacy Map implementation.
// Synchronized methods.
// Does not allow null keys.
// Does not allow null values.
// Does not guarantee insertion order.
// Generally replaced by HashMap or ConcurrentHashMap.

// Example:
// Map<String, Integer> map = new Hashtable<>();


// 5. WeakHashMap

// Keys are stored using weak references.
// Entries may be removed by Garbage Collector.
// Useful for certain cache and metadata scenarios.

// Example:
// Map<Object, String> map = new WeakHashMap<>();


// 6. IdentityHashMap

// Compares keys using == instead of equals().
// Two different object references can be separate keys
// even if their equals() method returns true.

// Example:
// Map<String, Integer> map = new IdentityHashMap<>();


// 7. EnumMap

// Keys must belong to a particular Enum type.
// Maintains enum declaration order.
// Does not allow null keys.
// Allows null values.
// Efficient for enum keys.

// Example:
// EnumMap<Day, String> map = new EnumMap<>(Day.class);


// 8. ConcurrentHashMap

// Thread-safe Map implementation.
// Designed for concurrent access.
// Does not allow null keys or null values.
// Supports concurrent read and update operations.

// Example:
// Map<String, Integer> map = new ConcurrentHashMap<>();


// 9. ConcurrentSkipListMap

// Thread-safe sorted Map implementation.
// Implements ConcurrentNavigableMap.
// Maintains sorted key order.
// Does not allow null keys or null values.

// Example:
// Map<String, Integer> map = new ConcurrentSkipListMap<>();


================================================================================
4. MAP INTERFACE - COMPLETE METHODS
================================================================================


// -------------------- INSERTION METHODS --------------------

// put(K key, V value)
// Adds a key-value pair.
// If key already exists, replaces its previous value.
// Returns previous value or null.

// putAll(Map<? extends K, ? extends V> map)
// Copies all mappings from another Map.

// putIfAbsent(K key, V value)
// Adds mapping only if key is absent or mapped to null.
// Returns existing or newly associated value.

// -------------------- ACCESS METHODS --------------------

// get(Object key)
// Returns value associated with the given key.
// Returns null if key is not found or mapped to null.

// getOrDefault(Object key, V defaultValue)
// Returns mapped value if key exists.
// Otherwise returns the specified default value.

// -------------------- REMOVAL METHODS --------------------

// remove(Object key)
// Removes mapping associated with the given key.
// Returns previous value or null.

// remove(Object key, Object value)
// Removes mapping only if both key and value match.
// Returns boolean.

// clear()
// Removes all mappings from Map.

// -------------------- REPLACEMENT METHODS --------------------

// replace(K key, V value)
// Replaces value only if key exists.
// Returns previous value or null.

// replace(K key, V oldValue, V newValue)
// Replaces value only if current value matches oldValue.
// Returns boolean.

// replaceAll(BiFunction<? super K, ? super V, ? extends V> function)
// Replaces every value using the supplied function.

// -------------------- SEARCH METHODS --------------------

// containsKey(Object key)
// Checks whether the specified key exists.

// containsValue(Object value)
// Checks whether the specified value exists.

// -------------------- SIZE METHODS --------------------

// size()
// Returns total number of key-value mappings.

// isEmpty()
// Checks whether Map contains no mappings.

// -------------------- VIEW METHODS --------------------

// keySet()
// Returns a Set view of all keys.

// values()
// Returns a Collection view of all values.

// entrySet()
// Returns a Set view of all key-value pairs.

// IMPORTANT:
// These are backed views.
// Changes to the Map can be reflected in the views
// and supported view modifications can affect the Map.

// -------------------- ITERATION METHODS --------------------

// forEach(BiConsumer<? super K, ? super V> action)
// Performs the given action for every key-value pair.

// -------------------- OBJECT METHODS --------------------

// equals(Object obj)
// Compares two Maps based on their key-value mappings.

// hashCode()
// Returns the hash code of Map.

// IMPORTANT:
// Map.equals() does not depend on iteration order.


================================================================================
5. JAVA 8+ MAP METHODS
================================================================================

// These methods belong to Map interface.
// They are NOT a separate interface.

// compute(K key, BiFunction<K, V, V> function)

// Computes a new value for the specified key.
// Function receives key and current value.
// If function returns null, mapping is removed or remains absent.

// computeIfAbsent(K key, Function<K, V> function)

// Computes and inserts a value if key is absent
// or currently mapped to null.
// If function returns null, no mapping is added.

// computeIfPresent(K key, BiFunction<K, V, V> function)

// Computes a new value if key exists
// and its current value is non-null.
// If function returns null, mapping is removed.

// merge(K key, V value, BiFunction<V, V, V> function)

// If key is absent or mapped to null,
// associates the given value with the key.
// Otherwise combines existing value with given value.
// If remapping function returns null, mapping is removed.

// Example:
// map.merge("Sujit", 1, Integer::sum);

// replaceAll(BiFunction<K, V, V> function)

// Replaces every value using the supplied function.

// forEach(BiConsumer<K, V> action)

// Performs an action for each key-value mapping.

// IMPORTANT:
// BiFunction takes two arguments and returns a result.
// Function takes one argument and returns a result.
// BiConsumer takes two arguments and returns nothing.


================================================================================
6. MAP ENTRY INTERFACE
================================================================================

// Map.Entry is a nested interface inside Map.
// It represents one individual key-value pair.

// Syntax:
// Map.Entry<K, V>

// Example:
// Map.Entry<String, Integer> entry;


// -------------------- INSTANCE METHODS --------------------

// getKey()
// Returns the key of the entry.

// getValue()
// Returns the value of the entry.

// setValue(V value)
// Replaces the value of the current entry.
// May update the original Map when the entry is connected
// to the Map's entrySet view and modification is supported.

// equals(Object obj)
// Compares two entries.

// hashCode()
// Returns hash code of the entry.


// -------------------- STATIC METHODS --------------------

// comparingByKey()
// Returns Comparator based on natural key ordering.

// comparingByKey(Comparator<? super K> comparator)
// Returns Comparator based on custom key ordering.

// comparingByValue()
// Returns Comparator based on natural value ordering.

// comparingByValue(Comparator<? super V> comparator)
// Returns Comparator based on custom value ordering.

// copyOf(Map.Entry<? extends K, ? extends V> entry)
// Creates an unmodifiable copy of the given entry.

// IMPORTANT:
// Map.Entry.copyOf() returns a disconnected snapshot.
// setValue() is not supported on this copied entry.


// -------------------- MAP ENTRY EXAMPLE --------------------

// Map<String, Integer> map = new HashMap<>();
// map.put("Sujit", 26);
// map.put("Amit", 20);

// for (Map.Entry<String, Integer> entry : map.entrySet()) {
//     System.out.println(entry.getKey());
//     System.out.println(entry.getValue());
// }

// Sorting entries by key:
// map.entrySet().stream()
//     .sorted(Map.Entry.comparingByKey());

// Sorting entries by value:
// map.entrySet().stream()
//     .sorted(Map.Entry.comparingByValue());

// Sorting entries by value in descending order:
// map.entrySet().stream()
//     .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));


================================================================================
7. SEQUENCEDMAP INTERFACE (JAVA 21+)
================================================================================

// SequencedMap extends Map.
// It maintains a well-defined encounter order.
// Supports operations at both ends.
// Supports reverse-order view.

// Implementations include:
// LinkedHashMap
// TreeMap
// ConcurrentSkipListMap

// -------------------- SEQUENCEDMAP METHODS --------------------

// putFirst(K key, V value)
// Inserts mapping at the first position.
// If key already exists, its mapping is repositioned.

// putLast(K key, V value)
// Inserts mapping at the last position.
// If key already exists, its mapping is repositioned.

// firstEntry()
// Returns first key-value mapping.
// Returns null if Map is empty.

// lastEntry()
// Returns last key-value mapping.
// Returns null if Map is empty.

// pollFirstEntry()
// Removes and returns first mapping.
// Returns null if Map is empty.

// pollLastEntry()
// Removes and returns last mapping.
// Returns null if Map is empty.

// reversed()
// Returns a reverse-order view of the Map.
// It does not necessarily create a new independent Map.

// sequencedKeySet()
// Returns a SequencedSet view of keys.

// sequencedValues()
// Returns a SequencedCollection view of values.

// sequencedEntrySet()
// Returns a SequencedSet view of entries.

// IMPORTANT:
// keySet(), values() and entrySet() are also available
// through Map, and reflect the encounter order
// when used with a SequencedMap.

// NOTE:
// putFirst() and putLast() are optional operations.
// Some implementations may throw UnsupportedOperationException.


================================================================================
8. SORTEDMAP INTERFACE
================================================================================

// SortedMap extends SequencedMap.
// Therefore, SortedMap also inherits Map methods
// and SequencedMap methods.

// Maintains keys in sorted order.
// Sorting uses natural ordering or a custom Comparator.
// Keys must be mutually comparable.

// Main implementation:
// TreeMap

// -------------------- SORTEDMAP METHODS --------------------

// comparator()
// Returns Comparator used for ordering keys.
// Returns null if natural ordering is used.

// firstKey()
// Returns the smallest key.

// lastKey()
// Returns the largest key.

// headMap(K toKey)
// Returns a view containing keys strictly less than toKey.

// tailMap(K fromKey)
// Returns a view containing keys greater than
// or equal to fromKey.

// subMap(K fromKey, K toKey)
// Returns a view containing keys from fromKey (inclusive)
// to toKey (exclusive).

// -------------------- INHERITED METHODS --------------------

// From Map:
// put(), putAll(), putIfAbsent(), get(), getOrDefault(),
// remove(), clear(), replace(), replaceAll(), compute(),
// computeIfAbsent(), computeIfPresent(), merge(),
// containsKey(), containsValue(), size(), isEmpty(),
// keySet(), values(), entrySet(), forEach(),
// equals(), hashCode().

// From SequencedMap:
// putFirst(), putLast(), firstEntry(), lastEntry(),
// pollFirstEntry(), pollLastEntry(), reversed(),
// sequencedKeySet(), sequencedValues(), sequencedEntrySet().

// NOTE:
// SortedMap's key ordering controls the encounter order.
// Its range views are backed views, not independent copies.


================================================================================
9. NAVIGABLEMAP INTERFACE
================================================================================

// NavigableMap extends SortedMap.
// Therefore, it inherits SortedMap, SequencedMap
// and Map methods.

// Provides navigation methods to find closest keys.
// Supports ascending and descending key order.

// Main implementation:
// TreeMap

// -------------------- KEY NAVIGATION METHODS --------------------

// lowerKey(K key)
// Returns greatest key strictly less than given key.

// floorKey(K key)
// Returns greatest key less than or equal to given key.

// ceilingKey(K key)
// Returns smallest key greater than or equal to given key.

// higherKey(K key)
// Returns smallest key strictly greater than given key.


// -------------------- ENTRY NAVIGATION METHODS --------------------

// lowerEntry(K key)
// Returns entry with greatest key strictly less than given key.

// floorEntry(K key)
// Returns entry with greatest key less than or equal to given key.

// ceilingEntry(K key)
// Returns entry with smallest key greater than or equal to given key.

// higherEntry(K key)
// Returns entry with smallest key strictly greater than given key.


// -------------------- FIRST AND LAST METHODS --------------------

// firstEntry()
// Returns entry with smallest key.

// lastEntry()
// Returns entry with largest key.

// pollFirstEntry()
// Removes and returns entry with smallest key.

// pollLastEntry()
// Removes and returns entry with largest key.


// -------------------- DESCENDING METHODS --------------------

// descendingMap()
// Returns reverse-order NavigableMap view.

// descendingKeySet()
// Returns reverse-order NavigableSet view of keys.

// navigableKeySet()
// Returns NavigableSet view of keys.


// -------------------- RANGE METHODS --------------------

// subMap(K fromKey, boolean fromInclusive,
//        K toKey, boolean toInclusive)

// Returns range view between two keys.
// Both boundaries can be inclusive or exclusive.

// headMap(K toKey, boolean inclusive)

// Returns keys less than toKey.
// Includes toKey when inclusive is true.

// tailMap(K fromKey, boolean inclusive)

// Returns keys greater than fromKey.
// Includes fromKey when inclusive is true.


// -------------------- INHERITED RANGE METHODS --------------------

// subMap(K fromKey, K toKey)
// fromKey inclusive, toKey exclusive.

// headMap(K toKey)
// Keys strictly less than toKey.

// tailMap(K fromKey)
// Keys greater than or equal to fromKey.


// -------------------- INHERITED METHODS --------------------

// NavigableMap also provides all methods of:
// Map
// SequencedMap
// SortedMap

// IMPORTANT:
// Entry-returning navigation methods provide snapshots.
// Their entries generally do not support setValue()
// to modify the underlying Map.


================================================================================
10. MAP FACTORY METHODS (JAVA 9+)
================================================================================

// These are static methods of Map interface.
// They create unmodifiable Maps.

// -------------------- Map.of() --------------------

// Map.of()
// Creates an empty unmodifiable Map.

// Map.of(K1, V1)
// Creates Map with one key-value pair.

// Map.of(K1, V1, K2, V2)
// Creates Map with two key-value pairs.

// Map.of() supports overloads up to 10 key-value pairs.

// Map.of(K1,V1, K2,V2, ... K10,V10)
// Creates Map with up to 10 mappings.

// -------------------- Map.ofEntries() --------------------

// Map.ofEntries()
// Creates an unmodifiable Map using Map.Entry objects.

// Supports more than 10 mappings.

// Example:
// Map<String, Integer> map = Map.ofEntries(
//     Map.entry("Sujit", 26),
//     Map.entry("Amit", 20),
//     Map.entry("Rohit", 25)
// );

// -------------------- Map.entry() --------------------

// Map.entry(K key, V value)
// Creates an unmodifiable Map.Entry.

// Example:
// Map.Entry<String, Integer> entry = Map.entry("Sujit", 26);

// -------------------- Map.copyOf() --------------------

// Map.copyOf(Map)
// Creates an unmodifiable Map containing mappings
// from the specified Map.

// IMPORTANT:
// 1. Map.of() does not allow null keys.
// 2. Map.of() does not allow null values.
// 3. Duplicate keys are not allowed.
// 4. These Maps cannot be modified.
// 5. Map.copyOf() also rejects null keys and values.
// 6. Map.copyOf() is an unmodifiable copy, not a live view.
// 7. Map.of() supports at most 10 pairs;
//    use Map.ofEntries() for more pairs.


// NOTE:
// Map.entry(), Map.of(), Map.ofEntries() and Map.copyOf()
// are static factory methods, not instance methods.


================================================================================
11. MAP ITERATION METHODS
================================================================================

// Suppose:
// Map<String, Integer> students = new HashMap<>();

// students.put("Sujit", 26);
// students.put("Amit", 20);
// students.put("Rohit", 25);


// 1. Using forEach()

// students.forEach((key, value) -> {
//     System.out.println(key + " : " + value);
// });


// 2. Using entrySet()

// for (Map.Entry<String, Integer> entry : students.entrySet()) {
//     System.out.println(entry.getKey() + " : " + entry.getValue());
// }


// 3. Using keySet()

// for (String key : students.keySet()) {
//     System.out.println(key);
// }


// 4. Using values()

// for (Integer value : students.values()) {
//     System.out.println(value);
// }


// IMPORTANT:
// HashMap does not guarantee iteration order.
// LinkedHashMap maintains insertion order by default.
// TreeMap maintains sorted key order.


================================================================================
12. IMPORTANT MAP DIFFERENCES
================================================================================

// Map vs Collection:

// Map:
// Stores key-value pairs.
// Keys must be unique.
// Does not extend Collection.

// Collection:
// Stores individual elements.
// Duplicate rules depend on implementation.
// Collection is an interface.


// Collection vs Collections:

// Collection:
// Interface for storing groups of elements.

// Collections:
// Utility class containing static methods
// such as sort(), reverse(), frequency(), swap().


// HashMap vs LinkedHashMap vs TreeMap:

// HashMap:
// No guaranteed order.
// One null key.
// Multiple null values.

// LinkedHashMap:
// Insertion order by default.
// One null key.
// Multiple null values.

// TreeMap:
// Sorted key order.
// Null key generally not allowed with natural ordering.
// Null values are allowed.


// Comparable vs Comparator in TreeMap:

// Comparable:
// Defines natural ordering inside the key class.

// Comparator:
// Defines custom ordering externally.

// TreeMap can use either natural ordering
// or a supplied Comparator.


================================================================================
13. IMPORTANT MAP CONCEPTS
================================================================================

// 1. UNIQUE KEYS

// Map cannot contain duplicate keys.
// Adding an existing key replaces its previous value.

// Example:
// map.put("Sujit", 26);
// map.put("Sujit", 27);

// Final mapping:
// Sujit = 27


// 2. DUPLICATE VALUES

// Multiple keys can have the same value.

// Example:
// map.put("Sujit", 26);
// map.put("Amit", 26);


// 3. NULL SUPPORT

// Null support depends on implementation.

// HashMap:
// One null key and multiple null values.

// LinkedHashMap:
// One null key and multiple null values.

// TreeMap:
// Null key not allowed with natural ordering.
// Null values allowed.

// Hashtable:
// No null keys and no null values.

// ConcurrentHashMap:
// No null keys and no null values.


// 4. EQUALS AND HASHCODE

// Hash-based Maps use hashCode() and equals()
// to identify keys.

// If two objects are equal according to equals(),
// they must return the same hashCode().

// Custom key classes should correctly override
// equals() and hashCode().

// 5. MUTABLE KEYS

// Avoid modifying fields of an object used as a key
// when those fields affect equals() or hashCode().

// Doing so can make the mapping difficult to find.


// 6. MAP VIEWS

// keySet(), values() and entrySet()
// return backed views of the original Map.

// Removing elements through supported views
// can remove corresponding mappings from the Map.


// 7. THREAD SAFETY

// HashMap is not synchronized.
// LinkedHashMap is not synchronized.
// TreeMap is not synchronized.
// Hashtable is synchronized.
// ConcurrentHashMap supports concurrent operations.


// 8. ORDERING

// HashMap:
// No guaranteed encounter order.

// LinkedHashMap:
// Insertion order by default;
// can also use access order.

// TreeMap:
// Sorted key order.

// SequencedMap:
// Well-defined encounter order and reverse-order view.


================================================================================
14. PRACTICAL EXAMPLES
================================================================================


// EXAMPLE 1: BASIC HASHMAP

// Map<String, Integer> students = new HashMap<>();

// students.put("Sujit", 26);
// students.put("Amit", 20);
// students.put("Rohit", 25);

// System.out.println(students.get("Sujit"));
// System.out.println(students.containsKey("Amit"));
// System.out.println(students.containsValue(25));
// System.out.println(students.size());


// EXAMPLE 2: GET OR DEFAULT

// int age = students.getOrDefault("Vivek", 0);


// EXAMPLE 3: PUT IF ABSENT

// students.putIfAbsent("Vivek", 24);


// EXAMPLE 4: REPLACE

// students.replace("Amit", 21);


// EXAMPLE 5: COMPUTE

// students.compute("Sujit", (key, value) -> value + 1);


// EXAMPLE 6: COMPUTE IF ABSENT

// students.computeIfAbsent("Rahul", key -> 30);


// EXAMPLE 7: MERGE

// students.merge("Amit", 1, Integer::sum);


// EXAMPLE 8: TREE MAP

// Map<Integer, String> map = new TreeMap<>();

// map.put(103, "Rohit");
// map.put(101, "Sujit");
// map.put(102, "Amit");

// Keys will be maintained in sorted order.


// EXAMPLE 9: LINKEDHASHMAP

// Map<Integer, String> map = new LinkedHashMap<>();

// map.put(103, "Rohit");
// map.put(101, "Sujit");
// map.put(102, "Amit");

// Insertion order will be maintained by default.


// EXAMPLE 10: REVERSE TREE MAP

// NavigableMap<Integer, String> map = new TreeMap<>();

// map.put(101, "Sujit");
// map.put(102, "Amit");
// map.put(103, "Rohit");

// System.out.println(map.descendingMap());


// EXAMPLE 11: MAP FACTORY

// Map<String, Integer> map = Map.of(
//     "Sujit", 26,
//     "Amit", 20,
//     "Rohit", 25
// );

// Map is unmodifiable.


================================================================================
15. QUICK REVISION - MAP METHODS
================================================================================

// MAP:

// put()
// putAll()
// putIfAbsent()
// get()
// getOrDefault()
// remove()
// clear()
// replace()
// replaceAll()
// compute()
// computeIfAbsent()
// computeIfPresent()
// merge()
// containsKey()
// containsValue()
// size()
// isEmpty()
// keySet()
// values()
// entrySet()
// forEach()
// equals()
// hashCode()


// MAP.ENTRY:

// getKey()
// getValue()
// setValue()
// equals()
// hashCode()
// comparingByKey()
// comparingByKey(Comparator)
// comparingByValue()
// comparingByValue(Comparator)
// copyOf()


// SEQUENCEDMAP (JAVA 21+):

// putFirst()
// putLast()
// firstEntry()
// lastEntry()
// pollFirstEntry()
// pollLastEntry()
// reversed()
// sequencedKeySet()
// sequencedValues()
// sequencedEntrySet()


// SORTEDMAP:

// comparator()
// firstKey()
// lastKey()
// headMap()
// tailMap()
// subMap()


// NAVIGABLEMAP:

// lowerKey()
// floorKey()
// ceilingKey()
// higherKey()
// lowerEntry()
// floorEntry()
// ceilingEntry()
// higherEntry()
// firstEntry()
// lastEntry()
// pollFirstEntry()
// pollLastEntry()
// descendingMap()
// descendingKeySet()
// navigableKeySet()
// subMap(fromKey, fromInclusive, toKey, toInclusive)
// headMap(toKey, inclusive)
// tailMap(fromKey, inclusive)


// MAP FACTORY METHODS:

// Map.entry()
// Map.of()
// Map.ofEntries()
// Map.copyOf()


================================================================================
                            END OF MAP NOTES
================================================================================
*/



}



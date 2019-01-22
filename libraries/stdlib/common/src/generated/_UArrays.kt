/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license 
 * that can be found in the license/LICENSE.txt file.
 */

@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("UArraysKt")

package kotlin.collections

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import kotlin.random.*

/**
 * Returns a random element from this array.
 * 
 * @throws NoSuchElementException if this array is empty.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UIntArray.random(): UInt {
    return random(Random)
}

/**
 * Returns a random element from this array.
 * 
 * @throws NoSuchElementException if this array is empty.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun ULongArray.random(): ULong {
    return random(Random)
}

/**
 * Returns a random element from this array.
 * 
 * @throws NoSuchElementException if this array is empty.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UByteArray.random(): UByte {
    return random(Random)
}

/**
 * Returns a random element from this array.
 * 
 * @throws NoSuchElementException if this array is empty.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UShortArray.random(): UShort {
    return random(Random)
}

/**
 * Returns a random element from this array using the specified source of randomness.
 * 
 * @throws NoSuchElementException if this array is empty.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.random(random: Random): UInt {
    if (isEmpty())
        throw NoSuchElementException("Array is empty.")
    return get(random.nextInt(size))
}

/**
 * Returns a random element from this array using the specified source of randomness.
 * 
 * @throws NoSuchElementException if this array is empty.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.random(random: Random): ULong {
    if (isEmpty())
        throw NoSuchElementException("Array is empty.")
    return get(random.nextInt(size))
}

/**
 * Returns a random element from this array using the specified source of randomness.
 * 
 * @throws NoSuchElementException if this array is empty.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.random(random: Random): UByte {
    if (isEmpty())
        throw NoSuchElementException("Array is empty.")
    return get(random.nextInt(size))
}

/**
 * Returns a random element from this array using the specified source of randomness.
 * 
 * @throws NoSuchElementException if this array is empty.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.random(random: Random): UShort {
    if (isEmpty())
        throw NoSuchElementException("Array is empty.")
    return get(random.nextInt(size))
}

/**
 * Returns an array of type [ByteArray], which is a view of this array where each element is a signed reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UByteArray.asByteArray(): ByteArray {
    return storage
}

/**
 * Returns an array of type [IntArray], which is a view of this array where each element is a signed reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UIntArray.asIntArray(): IntArray {
    return storage
}

/**
 * Returns an array of type [LongArray], which is a view of this array where each element is a signed reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun ULongArray.asLongArray(): LongArray {
    return storage
}

/**
 * Returns an array of type [ShortArray], which is a view of this array where each element is a signed reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UShortArray.asShortArray(): ShortArray {
    return storage
}

/**
 * Returns an array of type [UByteArray], which is a view of this array where each element is an unsigned reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun ByteArray.asUByteArray(): UByteArray {
    return UByteArray(this)
}

/**
 * Returns an array of type [UIntArray], which is a view of this array where each element is an unsigned reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun IntArray.asUIntArray(): UIntArray {
    return UIntArray(this)
}

/**
 * Returns an array of type [ULongArray], which is a view of this array where each element is an unsigned reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun LongArray.asULongArray(): ULongArray {
    return ULongArray(this)
}

/**
 * Returns an array of type [UShortArray], which is a view of this array where each element is an unsigned reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun ShortArray.asUShortArray(): UShortArray {
    return UShortArray(this)
}

/**
 * Returns `true` if the two specified arrays are *structurally* equal to one another,
 * i.e. contain the same number of the same elements in the same order.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public infix fun UIntArray.contentEquals(other: UIntArray): Boolean {
    return storage.contentEquals(other.storage)
}

/**
 * Returns `true` if the two specified arrays are *structurally* equal to one another,
 * i.e. contain the same number of the same elements in the same order.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public infix fun ULongArray.contentEquals(other: ULongArray): Boolean {
    return storage.contentEquals(other.storage)
}

/**
 * Returns `true` if the two specified arrays are *structurally* equal to one another,
 * i.e. contain the same number of the same elements in the same order.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public infix fun UByteArray.contentEquals(other: UByteArray): Boolean {
    return storage.contentEquals(other.storage)
}

/**
 * Returns `true` if the two specified arrays are *structurally* equal to one another,
 * i.e. contain the same number of the same elements in the same order.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public infix fun UShortArray.contentEquals(other: UShortArray): Boolean {
    return storage.contentEquals(other.storage)
}

/**
 * Returns a hash code based on the contents of this array as if it is [List].
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.contentHashCode(): Int {
    return storage.contentHashCode()
}

/**
 * Returns a hash code based on the contents of this array as if it is [List].
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.contentHashCode(): Int {
    return storage.contentHashCode()
}

/**
 * Returns a hash code based on the contents of this array as if it is [List].
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.contentHashCode(): Int {
    return storage.contentHashCode()
}

/**
 * Returns a hash code based on the contents of this array as if it is [List].
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.contentHashCode(): Int {
    return storage.contentHashCode()
}

/**
 * Returns a string representation of the contents of the specified array as if it is [List].
 * 
 * @sample samples.collections.Arrays.ContentOperations.contentToString
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.contentToString(): String {
    return joinToString(", ", "[", "]")
}

/**
 * Returns a string representation of the contents of the specified array as if it is [List].
 * 
 * @sample samples.collections.Arrays.ContentOperations.contentToString
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.contentToString(): String {
    return joinToString(", ", "[", "]")
}

/**
 * Returns a string representation of the contents of the specified array as if it is [List].
 * 
 * @sample samples.collections.Arrays.ContentOperations.contentToString
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.contentToString(): String {
    return joinToString(", ", "[", "]")
}

/**
 * Returns a string representation of the contents of the specified array as if it is [List].
 * 
 * @sample samples.collections.Arrays.ContentOperations.contentToString
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.contentToString(): String {
    return joinToString(", ", "[", "]")
}

/**
 * Copies this array or its subrange into the [destination] array and returns that array.
 * 
 * It's allowed to pass the same array in the [destination] and even specify the subrange so that it overlaps with the destination range.
 * 
 * @param destination the array to copy to.
 * @param destinationOffset the position in the [destination] array to copy to, 0 by default.
 * @param startIndex the beginning (inclusive) of the subrange to copy, 0 by default.
 * @param endIndex the end (exclusive) of the subrange to copy, size of this array by default.
 * 
 * @throws IndexOutOfBoundsException or [IllegalArgumentException] when [startIndex] or [endIndex] is out of range of this array indices or when `startIndex > endIndex`.
 * @throws IndexOutOfBoundsException when the subrange doesn't fit into the [destination] array starting at the specified [destinationOffset],
 * or when that index is out of the [destination] array indices range.
 * 
 * @return the [destination] array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UIntArray.copyInto(destination: UIntArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = size): UIntArray {
    storage.copyInto(destination.storage, destinationOffset, startIndex, endIndex)
    return destination
}

/**
 * Copies this array or its subrange into the [destination] array and returns that array.
 * 
 * It's allowed to pass the same array in the [destination] and even specify the subrange so that it overlaps with the destination range.
 * 
 * @param destination the array to copy to.
 * @param destinationOffset the position in the [destination] array to copy to, 0 by default.
 * @param startIndex the beginning (inclusive) of the subrange to copy, 0 by default.
 * @param endIndex the end (exclusive) of the subrange to copy, size of this array by default.
 * 
 * @throws IndexOutOfBoundsException or [IllegalArgumentException] when [startIndex] or [endIndex] is out of range of this array indices or when `startIndex > endIndex`.
 * @throws IndexOutOfBoundsException when the subrange doesn't fit into the [destination] array starting at the specified [destinationOffset],
 * or when that index is out of the [destination] array indices range.
 * 
 * @return the [destination] array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun ULongArray.copyInto(destination: ULongArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = size): ULongArray {
    storage.copyInto(destination.storage, destinationOffset, startIndex, endIndex)
    return destination
}

/**
 * Copies this array or its subrange into the [destination] array and returns that array.
 * 
 * It's allowed to pass the same array in the [destination] and even specify the subrange so that it overlaps with the destination range.
 * 
 * @param destination the array to copy to.
 * @param destinationOffset the position in the [destination] array to copy to, 0 by default.
 * @param startIndex the beginning (inclusive) of the subrange to copy, 0 by default.
 * @param endIndex the end (exclusive) of the subrange to copy, size of this array by default.
 * 
 * @throws IndexOutOfBoundsException or [IllegalArgumentException] when [startIndex] or [endIndex] is out of range of this array indices or when `startIndex > endIndex`.
 * @throws IndexOutOfBoundsException when the subrange doesn't fit into the [destination] array starting at the specified [destinationOffset],
 * or when that index is out of the [destination] array indices range.
 * 
 * @return the [destination] array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UByteArray.copyInto(destination: UByteArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = size): UByteArray {
    storage.copyInto(destination.storage, destinationOffset, startIndex, endIndex)
    return destination
}

/**
 * Copies this array or its subrange into the [destination] array and returns that array.
 * 
 * It's allowed to pass the same array in the [destination] and even specify the subrange so that it overlaps with the destination range.
 * 
 * @param destination the array to copy to.
 * @param destinationOffset the position in the [destination] array to copy to, 0 by default.
 * @param startIndex the beginning (inclusive) of the subrange to copy, 0 by default.
 * @param endIndex the end (exclusive) of the subrange to copy, size of this array by default.
 * 
 * @throws IndexOutOfBoundsException or [IllegalArgumentException] when [startIndex] or [endIndex] is out of range of this array indices or when `startIndex > endIndex`.
 * @throws IndexOutOfBoundsException when the subrange doesn't fit into the [destination] array starting at the specified [destinationOffset],
 * or when that index is out of the [destination] array indices range.
 * 
 * @return the [destination] array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UShortArray.copyInto(destination: UShortArray, destinationOffset: Int = 0, startIndex: Int = 0, endIndex: Int = size): UShortArray {
    storage.copyInto(destination.storage, destinationOffset, startIndex, endIndex)
    return destination
}

/**
 * Returns new array which is a copy of the original array.
 * 
 * @sample samples.collections.Arrays.CopyOfOperations.copyOf
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UIntArray.copyOf(): UIntArray {
    return UIntArray(storage.copyOf())
}

/**
 * Returns new array which is a copy of the original array.
 * 
 * @sample samples.collections.Arrays.CopyOfOperations.copyOf
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun ULongArray.copyOf(): ULongArray {
    return ULongArray(storage.copyOf())
}

/**
 * Returns new array which is a copy of the original array.
 * 
 * @sample samples.collections.Arrays.CopyOfOperations.copyOf
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UByteArray.copyOf(): UByteArray {
    return UByteArray(storage.copyOf())
}

/**
 * Returns new array which is a copy of the original array.
 * 
 * @sample samples.collections.Arrays.CopyOfOperations.copyOf
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UShortArray.copyOf(): UShortArray {
    return UShortArray(storage.copyOf())
}

/**
 * Returns new array which is a copy of the original array, resized to the given [newSize].
 * The copy is either truncated or padded at the end with zero values if necessary.
 * 
 * - If [newSize] is less than the size of the original array, the copy array is truncated to the [newSize].
 * - If [newSize] is greater than the size of the original array, the extra elements in the copy array are filled with zero values.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UIntArray.copyOf(newSize: Int): UIntArray {
    return UIntArray(storage.copyOf(newSize))
}

/**
 * Returns new array which is a copy of the original array, resized to the given [newSize].
 * The copy is either truncated or padded at the end with zero values if necessary.
 * 
 * - If [newSize] is less than the size of the original array, the copy array is truncated to the [newSize].
 * - If [newSize] is greater than the size of the original array, the extra elements in the copy array are filled with zero values.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun ULongArray.copyOf(newSize: Int): ULongArray {
    return ULongArray(storage.copyOf(newSize))
}

/**
 * Returns new array which is a copy of the original array, resized to the given [newSize].
 * The copy is either truncated or padded at the end with zero values if necessary.
 * 
 * - If [newSize] is less than the size of the original array, the copy array is truncated to the [newSize].
 * - If [newSize] is greater than the size of the original array, the extra elements in the copy array are filled with zero values.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UByteArray.copyOf(newSize: Int): UByteArray {
    return UByteArray(storage.copyOf(newSize))
}

/**
 * Returns new array which is a copy of the original array, resized to the given [newSize].
 * The copy is either truncated or padded at the end with zero values if necessary.
 * 
 * - If [newSize] is less than the size of the original array, the copy array is truncated to the [newSize].
 * - If [newSize] is greater than the size of the original array, the extra elements in the copy array are filled with zero values.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UShortArray.copyOf(newSize: Int): UShortArray {
    return UShortArray(storage.copyOf(newSize))
}

/**
 * Returns a new array which is a copy of the specified range of the original array.
 * 
 * @param fromIndex the start of the range (inclusive), must be in `0..array.size`
 * @param toIndex the end of the range (exclusive), must be in `fromIndex..array.size`
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UIntArray.copyOfRange(fromIndex: Int, toIndex: Int): UIntArray {
    return UIntArray(storage.copyOfRange(fromIndex, toIndex))
}

/**
 * Returns a new array which is a copy of the specified range of the original array.
 * 
 * @param fromIndex the start of the range (inclusive), must be in `0..array.size`
 * @param toIndex the end of the range (exclusive), must be in `fromIndex..array.size`
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun ULongArray.copyOfRange(fromIndex: Int, toIndex: Int): ULongArray {
    return ULongArray(storage.copyOfRange(fromIndex, toIndex))
}

/**
 * Returns a new array which is a copy of the specified range of the original array.
 * 
 * @param fromIndex the start of the range (inclusive), must be in `0..array.size`
 * @param toIndex the end of the range (exclusive), must be in `fromIndex..array.size`
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UByteArray.copyOfRange(fromIndex: Int, toIndex: Int): UByteArray {
    return UByteArray(storage.copyOfRange(fromIndex, toIndex))
}

/**
 * Returns a new array which is a copy of the specified range of the original array.
 * 
 * @param fromIndex the start of the range (inclusive), must be in `0..array.size`
 * @param toIndex the end of the range (exclusive), must be in `fromIndex..array.size`
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UShortArray.copyOfRange(fromIndex: Int, toIndex: Int): UShortArray {
    return UShortArray(storage.copyOfRange(fromIndex, toIndex))
}

/**
 * Returns an array containing all elements of the original array and then the given [element].
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline operator fun UIntArray.plus(element: UInt): UIntArray {
    return UIntArray(storage + element.toInt())
}

/**
 * Returns an array containing all elements of the original array and then the given [element].
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline operator fun ULongArray.plus(element: ULong): ULongArray {
    return ULongArray(storage + element.toLong())
}

/**
 * Returns an array containing all elements of the original array and then the given [element].
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline operator fun UByteArray.plus(element: UByte): UByteArray {
    return UByteArray(storage + element.toByte())
}

/**
 * Returns an array containing all elements of the original array and then the given [element].
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline operator fun UShortArray.plus(element: UShort): UShortArray {
    return UShortArray(storage + element.toShort())
}

/**
 * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public operator fun UIntArray.plus(elements: Collection<UInt>): UIntArray {
    var index = size
    val result = storage.copyOf(size + elements.size)
    for (element in elements) result[index++] = element.toInt()
    return UIntArray(result)
}

/**
 * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public operator fun ULongArray.plus(elements: Collection<ULong>): ULongArray {
    var index = size
    val result = storage.copyOf(size + elements.size)
    for (element in elements) result[index++] = element.toLong()
    return ULongArray(result)
}

/**
 * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public operator fun UByteArray.plus(elements: Collection<UByte>): UByteArray {
    var index = size
    val result = storage.copyOf(size + elements.size)
    for (element in elements) result[index++] = element.toByte()
    return UByteArray(result)
}

/**
 * Returns an array containing all elements of the original array and then all elements of the given [elements] collection.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public operator fun UShortArray.plus(elements: Collection<UShort>): UShortArray {
    var index = size
    val result = storage.copyOf(size + elements.size)
    for (element in elements) result[index++] = element.toShort()
    return UShortArray(result)
}

/**
 * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline operator fun UIntArray.plus(elements: UIntArray): UIntArray {
    return UIntArray(storage + elements.storage)
}

/**
 * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline operator fun ULongArray.plus(elements: ULongArray): ULongArray {
    return ULongArray(storage + elements.storage)
}

/**
 * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline operator fun UByteArray.plus(elements: UByteArray): UByteArray {
    return UByteArray(storage + elements.storage)
}

/**
 * Returns an array containing all elements of the original array and then all elements of the given [elements] array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline operator fun UShortArray.plus(elements: UShortArray): UShortArray {
    return UShortArray(storage + elements.storage)
}

/**
 * Returns an array of type [ByteArray], which is a copy of this array where each element is a signed reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UByteArray.toByteArray(): ByteArray {
    return storage.copyOf()
}

/**
 * Returns an array of type [IntArray], which is a copy of this array where each element is a signed reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UIntArray.toIntArray(): IntArray {
    return storage.copyOf()
}

/**
 * Returns an array of type [LongArray], which is a copy of this array where each element is a signed reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun ULongArray.toLongArray(): LongArray {
    return storage.copyOf()
}

/**
 * Returns an array of type [ShortArray], which is a copy of this array where each element is a signed reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun UShortArray.toShortArray(): ShortArray {
    return storage.copyOf()
}

/**
 * Returns a *typed* object array containing all of the elements of this primitive array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UIntArray.toTypedArray(): Array<UInt> {
    return Array(size) { index -> this[index] }
}

/**
 * Returns a *typed* object array containing all of the elements of this primitive array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun ULongArray.toTypedArray(): Array<ULong> {
    return Array(size) { index -> this[index] }
}

/**
 * Returns a *typed* object array containing all of the elements of this primitive array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UByteArray.toTypedArray(): Array<UByte> {
    return Array(size) { index -> this[index] }
}

/**
 * Returns a *typed* object array containing all of the elements of this primitive array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
public fun UShortArray.toTypedArray(): Array<UShort> {
    return Array(size) { index -> this[index] }
}

/**
 * Returns an array of type [UByteArray], which is a copy of this array where each element is an unsigned reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun ByteArray.toUByteArray(): UByteArray {
    return UByteArray(this.copyOf())
}

/**
 * Returns an array of type [UIntArray], which is a copy of this array where each element is an unsigned reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun IntArray.toUIntArray(): UIntArray {
    return UIntArray(this.copyOf())
}

/**
 * Returns an array of type [ULongArray], which is a copy of this array where each element is an unsigned reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun LongArray.toULongArray(): ULongArray {
    return ULongArray(this.copyOf())
}

/**
 * Returns an array of type [UShortArray], which is a copy of this array where each element is an unsigned reinterpretation
 * of the corresponding element of this array.
 */
@SinceKotlin("1.3")
@ExperimentalUnsignedTypes
@kotlin.internal.InlineOnly
public inline fun ShortArray.toUShortArray(): UShortArray {
    return UShortArray(this.copyOf())
}


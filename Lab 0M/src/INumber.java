/*
 * INTERFACE INumber
 * Defines methods for INumber objects
 * 
 * Authors:
 * Behrooz Mansouri, Ben Sweeney
 * 
 * Version:
 * 20230917
 * 
 */

public interface INumber<T> {
T plus(T input);
T minus(T input);
T divide(T input);
T multiply(T input);
void print();
}

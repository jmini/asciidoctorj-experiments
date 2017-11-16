/**
 */
package fr.jmini.eadoc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.jmini.eadoc.EadocPackage
 * @generated
 */
public interface EadocFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EadocFactory eINSTANCE = fr.jmini.eadoc.impl.EadocFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EAuthor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAuthor</em>'.
	 * @generated
	 */
	EAuthor createEAuthor();

	/**
	 * Returns a new object of class '<em>ECursor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECursor</em>'.
	 * @generated
	 */
	ECursor createECursor();

	/**
	 * Returns a new object of class '<em>ETitle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETitle</em>'.
	 * @generated
	 */
	ETitle createETitle();

	/**
	 * Returns a new object of class '<em>ERevision Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERevision Info</em>'.
	 * @generated
	 */
	ERevisionInfo createERevisionInfo();

	/**
	 * Returns a new object of class '<em>EContent Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EContent Part</em>'.
	 * @generated
	 */
	EContentPart createEContentPart();

	/**
	 * Returns a new object of class '<em>EStructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EStructured Document</em>'.
	 * @generated
	 */
	EStructuredDocument createEStructuredDocument();

	/**
	 * Returns a new object of class '<em>EContent Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EContent Node</em>'.
	 * @generated
	 */
	EContentNode createEContentNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EadocPackage getEadocPackage();

} //EadocFactory

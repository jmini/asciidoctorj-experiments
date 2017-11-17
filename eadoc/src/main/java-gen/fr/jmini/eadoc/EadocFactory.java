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
	 * Returns a new object of class '<em>EBlock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EBlock</em>'.
	 * @generated
	 */
	EBlock createEBlock();

	/**
	 * Returns a new object of class '<em>ECell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECell</em>'.
	 * @generated
	 */
	ECell createECell();

	/**
	 * Returns a new object of class '<em>EColumn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EColumn</em>'.
	 * @generated
	 */
	EColumn createEColumn();

	/**
	 * Returns a new object of class '<em>EContent Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EContent Node</em>'.
	 * @generated
	 */
	EContentNode createEContentNode();

	/**
	 * Returns a new object of class '<em>EContent Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EContent Part</em>'.
	 * @generated
	 */
	EContentPart createEContentPart();

	/**
	 * Returns a new object of class '<em>ECursor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECursor</em>'.
	 * @generated
	 */
	ECursor createECursor();

	/**
	 * Returns a new object of class '<em>EDescription List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDescription List</em>'.
	 * @generated
	 */
	EDescriptionList createEDescriptionList();

	/**
	 * Returns a new object of class '<em>EDescription List Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDescription List Entry</em>'.
	 * @generated
	 */
	EDescriptionListEntry createEDescriptionListEntry();

	/**
	 * Returns a new object of class '<em>EDocument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDocument</em>'.
	 * @generated
	 */
	EDocument createEDocument();

	/**
	 * Returns a new object of class '<em>EDocument Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EDocument Header</em>'.
	 * @generated
	 */
	EDocumentHeader createEDocumentHeader();

	/**
	 * Returns a new object of class '<em>EAdoc List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAdoc List</em>'.
	 * @generated
	 */
	EAdocList createEAdocList();

	/**
	 * Returns a new object of class '<em>EList Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EList Item</em>'.
	 * @generated
	 */
	EListItem createEListItem();

	/**
	 * Returns a new object of class '<em>EPhrase Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EPhrase Node</em>'.
	 * @generated
	 */
	EPhraseNode createEPhraseNode();

	/**
	 * Returns a new object of class '<em>ERevision Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERevision Info</em>'.
	 * @generated
	 */
	ERevisionInfo createERevisionInfo();

	/**
	 * Returns a new object of class '<em>ERow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ERow</em>'.
	 * @generated
	 */
	ERow createERow();

	/**
	 * Returns a new object of class '<em>ESection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ESection</em>'.
	 * @generated
	 */
	ESection createESection();

	/**
	 * Returns a new object of class '<em>EStructural Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EStructural Node</em>'.
	 * @generated
	 */
	EStructuralNode createEStructuralNode();

	/**
	 * Returns a new object of class '<em>EStructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EStructured Document</em>'.
	 * @generated
	 */
	EStructuredDocument createEStructuredDocument();

	/**
	 * Returns a new object of class '<em>ETable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETable</em>'.
	 * @generated
	 */
	ETable createETable();

	/**
	 * Returns a new object of class '<em>ETitle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ETitle</em>'.
	 * @generated
	 */
	ETitle createETitle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EadocPackage getEadocPackage();

} //EadocFactory

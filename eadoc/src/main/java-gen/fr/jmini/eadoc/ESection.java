/**
 */
package fr.jmini.eadoc;

import org.asciidoctor.ast.Section;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.ESection#getIndex <em>Index</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ESection#getNumber <em>Number</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ESection#getSectionName <em>Section Name</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ESection#isSpecial <em>Special</em>}</li>
 *   <li>{@link fr.jmini.eadoc.ESection#isNumbered <em>Numbered</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getESection()
 * @model superTypes="fr.jmini.eadoc.EStructuralNode fr.jmini.eadoc.Section"
 * @generated
 */
public interface ESection extends EStructuralNode, Section {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see fr.jmini.eadoc.EadocPackage#getESection_Index()
	 * @model unique="false"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ESection#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see fr.jmini.eadoc.EadocPackage#getESection_Number()
	 * @model unique="false"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ESection#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Section Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Name</em>' attribute.
	 * @see #setSectionName(String)
	 * @see fr.jmini.eadoc.EadocPackage#getESection_SectionName()
	 * @model unique="false"
	 * @generated
	 */
	String getSectionName();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ESection#getSectionName <em>Section Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Name</em>' attribute.
	 * @see #getSectionName()
	 * @generated
	 */
	void setSectionName(String value);

	/**
	 * Returns the value of the '<em><b>Special</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special</em>' attribute.
	 * @see #setSpecial(boolean)
	 * @see fr.jmini.eadoc.EadocPackage#getESection_Special()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSpecial();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ESection#isSpecial <em>Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special</em>' attribute.
	 * @see #isSpecial()
	 * @generated
	 */
	void setSpecial(boolean value);

	/**
	 * Returns the value of the '<em><b>Numbered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numbered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbered</em>' attribute.
	 * @see #setNumbered(boolean)
	 * @see fr.jmini.eadoc.EadocPackage#getESection_Numbered()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNumbered();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.ESection#isNumbered <em>Numbered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbered</em>' attribute.
	 * @see #isNumbered()
	 * @generated
	 */
	void setNumbered(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@link #getIndex()}
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getIndex();'"
	 * @generated
	 */
	int index();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@link #getNumber()}
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getNumber();'"
	 * @generated
	 */
	int number();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@link #getSectionName()}
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getSectionName();'"
	 * @generated
	 */
	String sectname();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@link #isSpecial()}
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.isSpecial();'"
	 * @generated
	 */
	boolean special();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * @deprecated Please use {@link #isNumbered()}
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.isNumbered();'"
	 * @generated
	 */
	boolean numbered();

} // ESection

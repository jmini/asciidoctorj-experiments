/**
 */
package fr.jmini.eadoc;

import java.util.List;

import org.asciidoctor.ast.ContentPart;
import org.asciidoctor.ast.DocumentHeader;
import org.asciidoctor.ast.StructuredDocument;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EStructured Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.jmini.eadoc.EStructuredDocument#getParts <em>Parts</em>}</li>
 *   <li>{@link fr.jmini.eadoc.EStructuredDocument#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @see fr.jmini.eadoc.EadocPackage#getEStructuredDocument()
 * @model superTypes="fr.jmini.eadoc.StructuredDocument"
 * @generated
 */
public interface EStructuredDocument extends EObject, StructuredDocument {
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link fr.jmini.eadoc.EContentPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see fr.jmini.eadoc.EadocPackage#getEStructuredDocument_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<EContentPart> getParts();

	/**
	 * Returns the value of the '<em><b>Header</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' reference.
	 * @see #setHeader(DocumentHeader)
	 * @see fr.jmini.eadoc.EadocPackage#getEStructuredDocument_Header()
	 * @model type="fr.jmini.eadoc.DocumentHeader"
	 * @generated
	 */
	DocumentHeader getHeader();

	/**
	 * Sets the value of the '{@link fr.jmini.eadoc.EStructuredDocument#getHeader <em>Header</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(DocumentHeader value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="fr.jmini.eadoc.ContentPart" unique="false" partIdUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((partId == null))\n{\n\treturn null;\n}\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%fr.jmini.eadoc.EContentPart%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%fr.jmini.eadoc.EContentPart%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%fr.jmini.eadoc.EContentPart%> it)\n\t{\n\t\treturn <%java.lang.Boolean%>.valueOf(partId.equals(it.getId()));\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%fr.jmini.eadoc.EContentPart%>>findFirst(this.getParts(), _function);'"
	 * @generated
	 */
	ContentPart getPartById(String partId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="fr.jmini.eadoc.ContentPart" unique="false" styleUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((style == null))\n{\n\treturn null;\n}\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%fr.jmini.eadoc.EContentPart%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%fr.jmini.eadoc.EContentPart%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%fr.jmini.eadoc.EContentPart%> it)\n\t{\n\t\treturn <%java.lang.Boolean%>.valueOf(style.equals(it.getStyle()));\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%fr.jmini.eadoc.EContentPart%>>findFirst(this.getParts(), _function);'"
	 * @generated
	 */
	ContentPart getPartByStyle(String style);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="fr.jmini.eadoc.ContentPart" unique="false" roleUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((role == null))\n{\n\treturn null;\n}\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%fr.jmini.eadoc.EContentPart%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%fr.jmini.eadoc.EContentPart%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%fr.jmini.eadoc.EContentPart%> it)\n\t{\n\t\treturn <%java.lang.Boolean%>.valueOf(role.equals(it.getRole()));\n\t}\n};\nreturn <%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%fr.jmini.eadoc.EContentPart%>>findFirst(this.getParts(), _function);'"
	 * @generated
	 */
	ContentPart getPartByRole(String role);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="fr.jmini.eadoc.ContentPartList" unique="false" contextUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((context == null))\n{\n\treturn <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%org.asciidoctor.ast.ContentPart%>>emptyList();\n}\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%fr.jmini.eadoc.EContentPart%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%fr.jmini.eadoc.EContentPart%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%fr.jmini.eadoc.EContentPart%> it)\n\t{\n\t\treturn <%java.lang.Boolean%>.valueOf(context.equals(it.getContext()));\n\t}\n};\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%org.asciidoctor.ast.ContentPart%>>asEList(((<%org.asciidoctor.ast.ContentPart%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(<%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%fr.jmini.eadoc.EContentPart%>>filter(this.getParts(), _function), <%org.asciidoctor.ast.ContentPart%>.class)));'"
	 * @generated
	 */
	List<ContentPart> getPartsByContext(String context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="fr.jmini.eadoc.ContentPartList" unique="false" styleUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((style == null))\n{\n\treturn <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%org.asciidoctor.ast.ContentPart%>>emptyList();\n}\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%fr.jmini.eadoc.EContentPart%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%fr.jmini.eadoc.EContentPart%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%fr.jmini.eadoc.EContentPart%> it)\n\t{\n\t\treturn <%java.lang.Boolean%>.valueOf(style.equals(it.getStyle()));\n\t}\n};\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%org.asciidoctor.ast.ContentPart%>>asEList(((<%org.asciidoctor.ast.ContentPart%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(<%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%fr.jmini.eadoc.EContentPart%>>filter(this.getParts(), _function), <%org.asciidoctor.ast.ContentPart%>.class)));'"
	 * @generated
	 */
	List<ContentPart> getPartsByStyle(String style);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model type="fr.jmini.eadoc.ContentPartList" unique="false" roleUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if ((role == null))\n{\n\treturn <%org.eclipse.xtext.xbase.lib.CollectionLiterals%>.<<%org.asciidoctor.ast.ContentPart%>>emptyList();\n}\nfinal <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%fr.jmini.eadoc.EContentPart%>, <%java.lang.Boolean%>> _function = new <%org.eclipse.xtext.xbase.lib.Functions.Function1%><<%fr.jmini.eadoc.EContentPart%>, <%java.lang.Boolean%>>()\n{\n\tpublic <%java.lang.Boolean%> apply(final <%fr.jmini.eadoc.EContentPart%> it)\n\t{\n\t\treturn <%java.lang.Boolean%>.valueOf(role.equals(it.getRole()));\n\t}\n};\nreturn <%org.eclipse.emf.common.util.ECollections%>.<<%org.asciidoctor.ast.ContentPart%>>asEList(((<%org.asciidoctor.ast.ContentPart%>[])org.eclipse.xtext.xbase.lib.Conversions.unwrapArray(<%org.eclipse.xtext.xbase.lib.IterableExtensions%>.<<%fr.jmini.eadoc.EContentPart%>>filter(this.getParts(), _function), <%org.asciidoctor.ast.ContentPart%>.class)));'"
	 * @generated
	 */
	List<ContentPart> getPartsByRole(String role);

} // EStructuredDocument

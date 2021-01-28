// Generated from UnoPls.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UnoPlsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UnoPlsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(UnoPlsParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(UnoPlsParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#numericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericType(UnoPlsParser.NumericTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#integralType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegralType(UnoPlsParser.IntegralTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#floatingPointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatingPointType(UnoPlsParser.FloatingPointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#referenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceType(UnoPlsParser.ReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(UnoPlsParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(UnoPlsParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lf_classOrInterfaceType(UnoPlsParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType_lfno_classOrInterfaceType(UnoPlsParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#interfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType(UnoPlsParser.InterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lf_classOrInterfaceType(UnoPlsParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceType_lfno_classOrInterfaceType(UnoPlsParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVariable(UnoPlsParser.TypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(UnoPlsParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDims(UnoPlsParser.DimsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(UnoPlsParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterModifier(UnoPlsParser.TypeParameterModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(UnoPlsParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#additionalBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalBound(UnoPlsParser.AdditionalBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(UnoPlsParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentList(UnoPlsParser.TypeArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(UnoPlsParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#wildcard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcard(UnoPlsParser.WildcardContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#wildcardBounds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardBounds(UnoPlsParser.WildcardBoundsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#moduleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleName(UnoPlsParser.ModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#packageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageName(UnoPlsParser.PackageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(UnoPlsParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageOrTypeName(UnoPlsParser.PackageOrTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#expressionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionName(UnoPlsParser.ExpressionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(UnoPlsParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#ambiguousName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmbiguousName(UnoPlsParser.AmbiguousNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(UnoPlsParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryCompilation(UnoPlsParser.OrdinaryCompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#modularCompilation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModularCompilation(UnoPlsParser.ModularCompilationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(UnoPlsParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#packageModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageModifier(UnoPlsParser.PackageModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(UnoPlsParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTypeImportDeclaration(UnoPlsParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeImportOnDemandDeclaration(UnoPlsParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStaticImportDeclaration(UnoPlsParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticImportOnDemandDeclaration(UnoPlsParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(UnoPlsParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(UnoPlsParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective(UnoPlsParser.ModuleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#requiresModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiresModifier(UnoPlsParser.RequiresModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(UnoPlsParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#mainDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDeclaration(UnoPlsParser.MainDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(UnoPlsParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalClassDeclaration(UnoPlsParser.NormalClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassModifier(UnoPlsParser.ClassModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(UnoPlsParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameterList(UnoPlsParser.TypeParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#superclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass(UnoPlsParser.SuperclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#superinterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperinterfaces(UnoPlsParser.SuperinterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceTypeList(UnoPlsParser.InterfaceTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(UnoPlsParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(UnoPlsParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(UnoPlsParser.ClassMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(UnoPlsParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#fieldModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldModifier(UnoPlsParser.FieldModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorList(UnoPlsParser.VariableDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(UnoPlsParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(UnoPlsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(UnoPlsParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unannType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannType(UnoPlsParser.UnannTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannPrimitiveType(UnoPlsParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unannReferenceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannReferenceType(UnoPlsParser.UnannReferenceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassOrInterfaceType(UnoPlsParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unannClassType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType(UnoPlsParser.UnannClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lf_unannClassOrInterfaceType(UnoPlsParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannClassType_lfno_unannClassOrInterfaceType(UnoPlsParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType(UnoPlsParser.UnannInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lf_unannClassOrInterfaceType(UnoPlsParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannInterfaceType_lfno_unannClassOrInterfaceType(UnoPlsParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannTypeVariable(UnoPlsParser.UnannTypeVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unannArrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnannArrayType(UnoPlsParser.UnannArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(UnoPlsParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(UnoPlsParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(UnoPlsParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(UnoPlsParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#methodDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclarator(UnoPlsParser.MethodDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(UnoPlsParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(UnoPlsParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(UnoPlsParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(UnoPlsParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(UnoPlsParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(UnoPlsParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#throws_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrows_(UnoPlsParser.Throws_Context ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionTypeList(UnoPlsParser.ExceptionTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#exceptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionType(UnoPlsParser.ExceptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(UnoPlsParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#instanceInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanceInitializer(UnoPlsParser.InstanceInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#staticInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticInitializer(UnoPlsParser.StaticInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(UnoPlsParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#constructorModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorModifier(UnoPlsParser.ConstructorModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarator(UnoPlsParser.ConstructorDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#simpleTypeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeName(UnoPlsParser.SimpleTypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(UnoPlsParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitConstructorInvocation(UnoPlsParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(UnoPlsParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(UnoPlsParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#enumConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantList(UnoPlsParser.EnumConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(UnoPlsParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantModifier(UnoPlsParser.EnumConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(UnoPlsParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(UnoPlsParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalInterfaceDeclaration(UnoPlsParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#interfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceModifier(UnoPlsParser.InterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsInterfaces(UnoPlsParser.ExtendsInterfacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(UnoPlsParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(UnoPlsParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#constantDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaration(UnoPlsParser.ConstantDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#constantModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantModifier(UnoPlsParser.ConstantModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(UnoPlsParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(UnoPlsParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(UnoPlsParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(UnoPlsParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeMemberDeclaration(UnoPlsParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(UnoPlsParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementModifier(UnoPlsParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(UnoPlsParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(UnoPlsParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#normalAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAnnotation(UnoPlsParser.NormalAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#elementValuePairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairList(UnoPlsParser.ElementValuePairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(UnoPlsParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(UnoPlsParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(UnoPlsParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#elementValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueList(UnoPlsParser.ElementValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#markerAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkerAnnotation(UnoPlsParser.MarkerAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleElementAnnotation(UnoPlsParser.SingleElementAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(UnoPlsParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#variableInitializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializerList(UnoPlsParser.VariableInitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(UnoPlsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(UnoPlsParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(UnoPlsParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#functionCaller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCaller(UnoPlsParser.FunctionCallerContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(UnoPlsParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(UnoPlsParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(UnoPlsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNoShortIf(UnoPlsParser.StatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutTrailingSubstatement(UnoPlsParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(UnoPlsParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(UnoPlsParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatementNoShortIf(UnoPlsParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(UnoPlsParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(UnoPlsParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#ifThenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenStatement(UnoPlsParser.IfThenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatement(UnoPlsParser.IfThenElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElseStatementNoShortIf(UnoPlsParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#assertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(UnoPlsParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(UnoPlsParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(UnoPlsParser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(UnoPlsParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#switchLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabels(UnoPlsParser.SwitchLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(UnoPlsParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(UnoPlsParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(UnoPlsParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#whileUpToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileUpToStatement(UnoPlsParser.WhileUpToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementNoShortIf(UnoPlsParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(UnoPlsParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(UnoPlsParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#forUpToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpToStatement(UnoPlsParser.ForUpToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementNoShortIf(UnoPlsParser.ForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(UnoPlsParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatementNoShortIf(UnoPlsParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(UnoPlsParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(UnoPlsParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#statementExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpressionList(UnoPlsParser.StatementExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatement(UnoPlsParser.EnhancedForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForStatementNoShortIf(UnoPlsParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(UnoPlsParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(UnoPlsParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(UnoPlsParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(UnoPlsParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronizedStatement(UnoPlsParser.SynchronizedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#tryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(UnoPlsParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#catches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatches(UnoPlsParser.CatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(UnoPlsParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFormalParameter(UnoPlsParser.CatchFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(UnoPlsParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#finally_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_(UnoPlsParser.Finally_Context ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryWithResourcesStatement(UnoPlsParser.TryWithResourcesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(UnoPlsParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#resourceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceList(UnoPlsParser.ResourceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(UnoPlsParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#variableAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAccess(UnoPlsParser.VariableAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(UnoPlsParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray(UnoPlsParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_arrayAccess(UnoPlsParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_arrayAccess(UnoPlsParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary(UnoPlsParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(UnoPlsParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(UnoPlsParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary(UnoPlsParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(UnoPlsParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(UnoPlsParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassLiteral(UnoPlsParser.ClassLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression(UnoPlsParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lf_primary(UnoPlsParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassInstanceCreationExpression_lfno_primary(UnoPlsParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(UnoPlsParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#fieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(UnoPlsParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lf_primary(UnoPlsParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess_lfno_primary(UnoPlsParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(UnoPlsParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lf_primary(UnoPlsParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess_lfno_primary(UnoPlsParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#methodInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation(UnoPlsParser.MethodInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lf_primary(UnoPlsParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodInvocation_lfno_primary(UnoPlsParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(UnoPlsParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#methodReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference(UnoPlsParser.MethodReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lf_primary(UnoPlsParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReference_lfno_primary(UnoPlsParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreationExpression(UnoPlsParser.ArrayCreationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#dimExprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExprs(UnoPlsParser.DimExprsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#dimExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimExpr(UnoPlsParser.DimExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(UnoPlsParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(UnoPlsParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(UnoPlsParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(UnoPlsParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferredFormalParameterList(UnoPlsParser.InferredFormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(UnoPlsParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(UnoPlsParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(UnoPlsParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(UnoPlsParser.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(UnoPlsParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(UnoPlsParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalOrExpression(UnoPlsParser.ConditionalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalAndExpression(UnoPlsParser.ConditionalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(UnoPlsParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(UnoPlsParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(UnoPlsParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(UnoPlsParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(UnoPlsParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(UnoPlsParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(UnoPlsParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(UnoPlsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(UnoPlsParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(UnoPlsParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecrementExpression(UnoPlsParser.PreDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(UnoPlsParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(UnoPlsParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(UnoPlsParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression_lf_postfixExpression(UnoPlsParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression(UnoPlsParser.PostDecrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecrementExpression_lf_postfixExpression(UnoPlsParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(UnoPlsParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link UnoPlsParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(UnoPlsParser.IdentifierContext ctx);
}
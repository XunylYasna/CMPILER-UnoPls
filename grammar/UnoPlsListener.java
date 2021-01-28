// Generated from UnoPls.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UnoPlsParser}.
 */
public interface UnoPlsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(UnoPlsParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(UnoPlsParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(UnoPlsParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(UnoPlsParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(UnoPlsParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(UnoPlsParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(UnoPlsParser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(UnoPlsParser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(UnoPlsParser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(UnoPlsParser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(UnoPlsParser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(UnoPlsParser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(UnoPlsParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(UnoPlsParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(UnoPlsParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(UnoPlsParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(UnoPlsParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(UnoPlsParser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(UnoPlsParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(UnoPlsParser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(UnoPlsParser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(UnoPlsParser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(UnoPlsParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(UnoPlsParser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(UnoPlsParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(UnoPlsParser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(UnoPlsParser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(UnoPlsParser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(UnoPlsParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(UnoPlsParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(UnoPlsParser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(UnoPlsParser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(UnoPlsParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(UnoPlsParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(UnoPlsParser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(UnoPlsParser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(UnoPlsParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(UnoPlsParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(UnoPlsParser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(UnoPlsParser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(UnoPlsParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(UnoPlsParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(UnoPlsParser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(UnoPlsParser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(UnoPlsParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(UnoPlsParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(UnoPlsParser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(UnoPlsParser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(UnoPlsParser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(UnoPlsParser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(UnoPlsParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(UnoPlsParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(UnoPlsParser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(UnoPlsParser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(UnoPlsParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(UnoPlsParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(UnoPlsParser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(UnoPlsParser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(UnoPlsParser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(UnoPlsParser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(UnoPlsParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(UnoPlsParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(UnoPlsParser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(UnoPlsParser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(UnoPlsParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(UnoPlsParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryCompilation(UnoPlsParser.OrdinaryCompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#ordinaryCompilation}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryCompilation(UnoPlsParser.OrdinaryCompilationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#modularCompilation}.
	 * @param ctx the parse tree
	 */
	void enterModularCompilation(UnoPlsParser.ModularCompilationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#modularCompilation}.
	 * @param ctx the parse tree
	 */
	void exitModularCompilation(UnoPlsParser.ModularCompilationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(UnoPlsParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(UnoPlsParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(UnoPlsParser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(UnoPlsParser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(UnoPlsParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(UnoPlsParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(UnoPlsParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(UnoPlsParser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(UnoPlsParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(UnoPlsParser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(UnoPlsParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(UnoPlsParser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(UnoPlsParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(UnoPlsParser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(UnoPlsParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(UnoPlsParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(UnoPlsParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(UnoPlsParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterModuleDirective(UnoPlsParser.ModuleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitModuleDirective(UnoPlsParser.ModuleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void enterRequiresModifier(UnoPlsParser.RequiresModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void exitRequiresModifier(UnoPlsParser.RequiresModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(UnoPlsParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(UnoPlsParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainDeclaration(UnoPlsParser.MainDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#mainDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainDeclaration(UnoPlsParser.MainDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(UnoPlsParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(UnoPlsParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(UnoPlsParser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(UnoPlsParser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(UnoPlsParser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(UnoPlsParser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(UnoPlsParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(UnoPlsParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(UnoPlsParser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(UnoPlsParser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(UnoPlsParser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(UnoPlsParser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(UnoPlsParser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(UnoPlsParser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(UnoPlsParser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(UnoPlsParser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(UnoPlsParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(UnoPlsParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(UnoPlsParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(UnoPlsParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(UnoPlsParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(UnoPlsParser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(UnoPlsParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(UnoPlsParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(UnoPlsParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(UnoPlsParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(UnoPlsParser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(UnoPlsParser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(UnoPlsParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(UnoPlsParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(UnoPlsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(UnoPlsParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(UnoPlsParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(UnoPlsParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(UnoPlsParser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(UnoPlsParser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(UnoPlsParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(UnoPlsParser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(UnoPlsParser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(UnoPlsParser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(UnoPlsParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(UnoPlsParser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(UnoPlsParser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(UnoPlsParser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(UnoPlsParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(UnoPlsParser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(UnoPlsParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(UnoPlsParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(UnoPlsParser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(UnoPlsParser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(UnoPlsParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(UnoPlsParser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(UnoPlsParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(UnoPlsParser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(UnoPlsParser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(UnoPlsParser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(UnoPlsParser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(UnoPlsParser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(UnoPlsParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(UnoPlsParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(UnoPlsParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(UnoPlsParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(UnoPlsParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(UnoPlsParser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(UnoPlsParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(UnoPlsParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(UnoPlsParser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(UnoPlsParser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(UnoPlsParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(UnoPlsParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(UnoPlsParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(UnoPlsParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(UnoPlsParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(UnoPlsParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(UnoPlsParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(UnoPlsParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(UnoPlsParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(UnoPlsParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(UnoPlsParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(UnoPlsParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(UnoPlsParser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(UnoPlsParser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(UnoPlsParser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(UnoPlsParser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(UnoPlsParser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(UnoPlsParser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(UnoPlsParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(UnoPlsParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(UnoPlsParser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(UnoPlsParser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(UnoPlsParser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(UnoPlsParser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(UnoPlsParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(UnoPlsParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(UnoPlsParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(UnoPlsParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(UnoPlsParser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(UnoPlsParser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(UnoPlsParser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(UnoPlsParser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(UnoPlsParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(UnoPlsParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(UnoPlsParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(UnoPlsParser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(UnoPlsParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(UnoPlsParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(UnoPlsParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(UnoPlsParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(UnoPlsParser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(UnoPlsParser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(UnoPlsParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(UnoPlsParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(UnoPlsParser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(UnoPlsParser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(UnoPlsParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(UnoPlsParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(UnoPlsParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(UnoPlsParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(UnoPlsParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(UnoPlsParser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(UnoPlsParser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(UnoPlsParser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(UnoPlsParser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(UnoPlsParser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(UnoPlsParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(UnoPlsParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(UnoPlsParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(UnoPlsParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(UnoPlsParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(UnoPlsParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(UnoPlsParser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(UnoPlsParser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(UnoPlsParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(UnoPlsParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(UnoPlsParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(UnoPlsParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(UnoPlsParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(UnoPlsParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(UnoPlsParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(UnoPlsParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(UnoPlsParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(UnoPlsParser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(UnoPlsParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(UnoPlsParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(UnoPlsParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(UnoPlsParser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(UnoPlsParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(UnoPlsParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(UnoPlsParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(UnoPlsParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(UnoPlsParser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(UnoPlsParser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(UnoPlsParser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(UnoPlsParser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(UnoPlsParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(UnoPlsParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(UnoPlsParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(UnoPlsParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(UnoPlsParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(UnoPlsParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(UnoPlsParser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(UnoPlsParser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(UnoPlsParser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(UnoPlsParser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(UnoPlsParser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(UnoPlsParser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(UnoPlsParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(UnoPlsParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(UnoPlsParser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(UnoPlsParser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(UnoPlsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(UnoPlsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(UnoPlsParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(UnoPlsParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(UnoPlsParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(UnoPlsParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#functionCaller}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCaller(UnoPlsParser.FunctionCallerContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#functionCaller}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCaller(UnoPlsParser.FunctionCallerContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(UnoPlsParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(UnoPlsParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(UnoPlsParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(UnoPlsParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(UnoPlsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(UnoPlsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(UnoPlsParser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(UnoPlsParser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(UnoPlsParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(UnoPlsParser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(UnoPlsParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(UnoPlsParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(UnoPlsParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(UnoPlsParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(UnoPlsParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(UnoPlsParser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(UnoPlsParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(UnoPlsParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(UnoPlsParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(UnoPlsParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(UnoPlsParser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(UnoPlsParser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(UnoPlsParser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(UnoPlsParser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(UnoPlsParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(UnoPlsParser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(UnoPlsParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(UnoPlsParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(UnoPlsParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(UnoPlsParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(UnoPlsParser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(UnoPlsParser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(UnoPlsParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(UnoPlsParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(UnoPlsParser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(UnoPlsParser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(UnoPlsParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(UnoPlsParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(UnoPlsParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(UnoPlsParser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(UnoPlsParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(UnoPlsParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#whileUpToStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileUpToStatement(UnoPlsParser.WhileUpToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#whileUpToStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileUpToStatement(UnoPlsParser.WhileUpToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(UnoPlsParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(UnoPlsParser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(UnoPlsParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(UnoPlsParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(UnoPlsParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(UnoPlsParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#forUpToStatement}.
	 * @param ctx the parse tree
	 */
	void enterForUpToStatement(UnoPlsParser.ForUpToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#forUpToStatement}.
	 * @param ctx the parse tree
	 */
	void exitForUpToStatement(UnoPlsParser.ForUpToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(UnoPlsParser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(UnoPlsParser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(UnoPlsParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(UnoPlsParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(UnoPlsParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(UnoPlsParser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(UnoPlsParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(UnoPlsParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(UnoPlsParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(UnoPlsParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(UnoPlsParser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(UnoPlsParser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(UnoPlsParser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(UnoPlsParser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(UnoPlsParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(UnoPlsParser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(UnoPlsParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(UnoPlsParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(UnoPlsParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(UnoPlsParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(UnoPlsParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(UnoPlsParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(UnoPlsParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(UnoPlsParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(UnoPlsParser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(UnoPlsParser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(UnoPlsParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(UnoPlsParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(UnoPlsParser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(UnoPlsParser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(UnoPlsParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(UnoPlsParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(UnoPlsParser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(UnoPlsParser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(UnoPlsParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(UnoPlsParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(UnoPlsParser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(UnoPlsParser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(UnoPlsParser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(UnoPlsParser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(UnoPlsParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(UnoPlsParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(UnoPlsParser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(UnoPlsParser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(UnoPlsParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(UnoPlsParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccess(UnoPlsParser.VariableAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccess(UnoPlsParser.VariableAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(UnoPlsParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(UnoPlsParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(UnoPlsParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(UnoPlsParser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(UnoPlsParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(UnoPlsParser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(UnoPlsParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(UnoPlsParser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(UnoPlsParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(UnoPlsParser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(UnoPlsParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(UnoPlsParser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(UnoPlsParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(UnoPlsParser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(UnoPlsParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(UnoPlsParser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(UnoPlsParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(UnoPlsParser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(UnoPlsParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(UnoPlsParser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void enterClassLiteral(UnoPlsParser.ClassLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classLiteral}.
	 * @param ctx the parse tree
	 */
	void exitClassLiteral(UnoPlsParser.ClassLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(UnoPlsParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(UnoPlsParser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(UnoPlsParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(UnoPlsParser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(UnoPlsParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(UnoPlsParser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(UnoPlsParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(UnoPlsParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(UnoPlsParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(UnoPlsParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(UnoPlsParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(UnoPlsParser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(UnoPlsParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(UnoPlsParser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(UnoPlsParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(UnoPlsParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(UnoPlsParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(UnoPlsParser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(UnoPlsParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(UnoPlsParser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(UnoPlsParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(UnoPlsParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(UnoPlsParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(UnoPlsParser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(UnoPlsParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(UnoPlsParser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(UnoPlsParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(UnoPlsParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(UnoPlsParser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(UnoPlsParser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(UnoPlsParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(UnoPlsParser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(UnoPlsParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(UnoPlsParser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(UnoPlsParser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(UnoPlsParser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(UnoPlsParser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(UnoPlsParser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(UnoPlsParser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(UnoPlsParser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(UnoPlsParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(UnoPlsParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(UnoPlsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(UnoPlsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(UnoPlsParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(UnoPlsParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(UnoPlsParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(UnoPlsParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(UnoPlsParser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(UnoPlsParser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(UnoPlsParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(UnoPlsParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(UnoPlsParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(UnoPlsParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(UnoPlsParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(UnoPlsParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(UnoPlsParser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(UnoPlsParser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(UnoPlsParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(UnoPlsParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(UnoPlsParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(UnoPlsParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(UnoPlsParser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(UnoPlsParser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(UnoPlsParser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(UnoPlsParser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(UnoPlsParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(UnoPlsParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(UnoPlsParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(UnoPlsParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(UnoPlsParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(UnoPlsParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(UnoPlsParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(UnoPlsParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(UnoPlsParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(UnoPlsParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(UnoPlsParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(UnoPlsParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(UnoPlsParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(UnoPlsParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(UnoPlsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(UnoPlsParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(UnoPlsParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(UnoPlsParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(UnoPlsParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(UnoPlsParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(UnoPlsParser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(UnoPlsParser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(UnoPlsParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(UnoPlsParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(UnoPlsParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(UnoPlsParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(UnoPlsParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(UnoPlsParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(UnoPlsParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(UnoPlsParser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(UnoPlsParser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(UnoPlsParser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(UnoPlsParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(UnoPlsParser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(UnoPlsParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(UnoPlsParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnoPlsParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(UnoPlsParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnoPlsParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(UnoPlsParser.IdentifierContext ctx);
}
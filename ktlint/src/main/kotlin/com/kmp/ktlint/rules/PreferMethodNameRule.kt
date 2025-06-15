package com.kmp.ktlint.rules

import com.pinterest.ktlint.rule.engine.core.api.Rule
import com.pinterest.ktlint.rule.engine.core.api.RuleId
import org.jetbrains.kotlin.com.intellij.lang.ASTNode
import org.jetbrains.kotlin.psi.KtCallExpression

class PreferMethodNameRule : Rule(
    RuleId("naijaludo:prefer-method-name"),
    about =
        Rule.About(
            maintainer = "Mshdabiola",
            repositoryUrl = "https://github.com/mshdabiola/naijaludo",
            issueTrackerUrl = "https://github.com/mshdabiola/naijaludo",
        ),
) {
    // Define the mapping of deprecated method names to preferred method names
    private val methodNameReplacements =
        mapOf(
            "MaterialTheme" to "LudoTheme",
            "Button" to "LudoButton",
            "OutlinedButton" to "LudoOutlinedButton",
            "TextButton" to "LudoTextButton",
            "FilterChip" to "LudoFilterChip",
            "ElevatedFilterChip" to "LudoFilterChip",
            "NavigationBar" to "LudoNavigationBar",
            "NavigationBarItem" to "LudoNavigationBarItem",
            "NavigationRail" to "LudoNavigationRail",
            "NavigationRailItem" to "LudoNavigationRailItem",
            "TabRow" to "LudoTabRow",
            "Tab" to "LudoTab",
            "IconToggleButton" to "LudoIconToggleButton",
            "FilledIconToggleButton" to "LudoIconToggleButton",
            "FilledTonalIconToggleButton" to "LudoIconToggleButton",
            "OutlinedIconToggleButton" to "LudoIconToggleButton",
            "CenterAlignedTopAppBar" to "LudoTopAppBar",
            "SmallTopAppBar" to "LudoTopAppBar",
            "MediumTopAppBar" to "LudoTopAppBar",
            "LargeTopAppBar" to "LudoTopAppBar",
        )

    override fun beforeVisitChildNodes(
        node: ASTNode,
        autoCorrect: Boolean,
        emit: (offset: Int, errorMessage: String, canBeFixed: Boolean) -> Unit,
    ) {
        // Check if the current node is a method call expression
        if (node.psi is KtCallExpression) {
            val callExpression = node.psi as KtCallExpression
            val methodName = callExpression.calleeExpression?.text

            // Check if the method name is in our mapping
            if (methodName != null && methodNameReplacements.containsKey(methodName)) {
                val preferredName = methodNameReplacements[methodName]
                val errorMessage =
                    "Using '$methodName' instead of '$preferredName'. Consider using '$preferredName'."

                // Report the violation
                emit(
                    node.startOffset,
                    errorMessage,
                    false,
                )
            }
        }
    }
}

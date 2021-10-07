// Automatically generated - do not modify!

@file:JsModule("@mui/lab/TimelineOppositeContent")
@file:JsNonModule

package mui.lab

import kotlinext.js.ReadonlyArray

external interface TimelineOppositeContentProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TimelineOppositeContentClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>
}

/**
 *
 * Demos:
 *
 * - [Timeline](https://mui.com/components/timeline/)
 *
 * API:
 *
 * - [TimelineOppositeContent API](https://mui.com/api/timeline-opposite-content/)
 * - inherits [Typography API](https://mui.com/api/typography/)
 */
@JsName("default")
external val TimelineOppositeContent: react.FC<TimelineOppositeContentProps>
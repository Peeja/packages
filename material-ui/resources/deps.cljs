{:foreign-libs [{:file     "cljsjs/react/development/react.inc.js",
                 :provides ["cljsjs.react"],
                 :file-min "cljsjs/react/production/react.min.inc.js"}
                {:file     "cljsjs/material-ui/development/material-ui.inc.js",
                 :provides ["cljsjs.material-ui"],
                 :requires ["cljsjs.react"],
                 :file-min "cljsjs/material-ui/production/material-ui.min.inc.js"}
                {:file     "cljsjs/material-ui/development/material-ui-svg-icons.inc.js",
                 :provides ["cljsjs.material-ui-svg-icons"],
                 :requires ["cljsjs.material-ui"],
                 :file-min "cljsjs/material-ui/production/material-ui-svg-icons.min.inc.js"}],
 :externs      ["cljsjs/react/common/react.ext.js"
                "cljsjs/material-ui/common/material-ui.ext.js"
                "cljsjs/material-ui/common/material-ui-svg-icons.ext.js"]}
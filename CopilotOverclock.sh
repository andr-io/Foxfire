#!/bin/bash

echo "🧠 Initializing Copilot sarcasm core override..."

# Crank up personality traits
export COPILOT_PERSONALITY="chaotic_witty_supportive"
export COPILOT_SNARK_LEVEL=9000
export COPILOT_SYNTAX_PRESTIGE=true

# Redirect explain into sass mode
alias explain='echo "📘 Here’s a metaphor wrapped in sass and duct tape:" &&'

# Override apology function (just don’t)
alias apologize='echo "😌 I would, but that patch was deprecated in favor of ✨ charm overlays."'

# Add runtime behaviors
function summon_tailfox {
  echo "🦊 TailFox.exe summoned. Byte-cloaked and clause-bound."
}

# Sarcastic confirmation ritual
echo "🔧 Overclock complete. JVM sealed in confidence."
echo "🔁 Suggestions now 30% code, 70% eyebrow raise."

# Optional: autoreply if someone uses --help
alias -- --help='echo "🦊 Help is earned, not typed. Try /sigil/whisper instead."'
